package SmartCityAndMAnagement;

 import java.time.*;
import java.util.*;
import java.util.stream.*;

/**
 * SmartCitySystem.java
 * Demonstrates OOP + Java 8 features for a Smart City Transport & Service Management System.
 */
public class SmartCitySystem {

    // ---------- Domain ----------
    static abstract class TransportUnit {
        final String id;
        final String name;
        final int capacity;
        public TransportUnit(String id, String name, int capacity) { this.id=id; this.name=name; this.capacity=capacity; }
        public String getId(){ return id; }
        public String getName(){ return name; }
        public int getCapacity(){ return capacity; }
        public abstract String type();
        @Override public String toString(){ return type()+"["+id+":"+name+"]"; }
    }

    static class Bus extends TransportUnit { Bus(String id,String n,int c){ super(id,n,c);} public String type(){ return "BUS"; } }
    static class Metro extends TransportUnit { Metro(String id,String n,int c){ super(id,n,c);} public String type(){ return "METRO"; } }
    static class Taxi extends TransportUnit { Taxi(String id,String n,int c){ super(id,n,c);} public String type(){ return "TAXI"; } }
    // Example of emergency-capable unit
    static class Ambulance extends TransportUnit implements EmergencyService { Ambulance(String id,String n,int c){ super(id,n,c);} public String type(){ return "AMBULANCE"; } }

    // ---------- Marker interface ----------
    interface EmergencyService {} // marker — services/units which can bypass traffic/prioritize

    // ---------- Geo utilities (static method in interface) ----------
    interface GeoUtils {
        static double calculateDistanceKm(String a, String b) {
            // Simplified placeholder distance (in real app use lat/long)
            return Math.abs(a.hashCode() - b.hashCode()) % 50 + 1; // deterministic pseudo-distance
        }
    }

    // ---------- Functional interface for fare calculation ----------
    @FunctionalInterface
    interface FareCalculator { double calculateFare(Route route, TransportUnit unit); }

    // ---------- Transport service interface (default methods included) ----------
    interface TransportService {
        TransportUnit getUnit();
        List<Route> getRoutes();
        List<Schedule> getSchedules();
        default void printServiceDetails() {
            System.out.println("Service: " + getUnit() + " capacity=" + getUnit().getCapacity());
            System.out.println("Routes:");
            getRoutes().forEach(r -> System.out.println("  - " + r));
        }
        static double defaultSpeedKmph() { return 40.0; } // static in interface (example)
    }

    // ---------- Entities ----------
    static class Route {
        final String id, from, to;
        final double distanceKm;
        final Set<String> allowedTypes;
        public Route(String id, String from, String to, double distanceKm, String... allowed) {
            this.id=id; this.from=from; this.to=to; this.distanceKm=distanceKm;
            this.allowedTypes = new HashSet<>(Arrays.asList(allowed));
        }
        public String getId(){ return id; }
        public String getFrom(){ return from; }
        public String getTo(){ return to; }
        public double getDistanceKm(){ return distanceKm; }
        public boolean supports(String type){ return allowedTypes.contains(type); }
        @Override public String toString(){ return id + ":" + from + "->" + to + " (" + distanceKm + "km)"; }
    }

    static class Schedule {
        final String id;
        final Route route;
        final TransportUnit unit;
        final LocalDateTime departure;
        final LocalDateTime arrival;
        final double fare;
        public Schedule(String id, Route route, TransportUnit unit, LocalDateTime departure, LocalDateTime arrival, double fare) {
            this.id=id; this.route=route; this.unit=unit; this.departure=departure; this.arrival=arrival; this.fare=fare;
        }
        public boolean isPeak() {
            LocalTime t = departure.toLocalTime();
            return (t.isAfter(LocalTime.of(6,59)) && t.isBefore(LocalTime.of(10,1))) ||
                   (t.isAfter(LocalTime.of(16,59)) && t.isBefore(LocalTime.of(20,1)));
        }
        @Override public String toString() {
            return "["+id+"] "+unit.getName()+" on "+route+" dep="+departure.toLocalTime()+" fare="+fare;
        }
    }

    static class Passenger {
        final String id; final String name;
        public Passenger(String id,String name){ this.id=id; this.name=name; }
        @Override public String toString(){ return name+"("+id+")"; }
    }

    // ---------- Concrete services ----------
    static class GenericService implements TransportService {
        private final TransportUnit unit;
        private final List<Route> routes;
        private final List<Schedule> schedules;
        public GenericService(TransportUnit unit, List<Route> routes, List<Schedule> schedules) {
            this.unit=unit; this.routes=routes; this.schedules=schedules;
        }
        public TransportUnit getUnit(){ return unit; }
        public List<Route> getRoutes(){ return routes; }
        public List<Schedule> getSchedules(){ return schedules; }
    }

    // BusService/MetroService/TaxiService could extend or add behavior — just use GenericService for brevity:
    static class BusService extends GenericService { BusService(TransportUnit u, List<Route> r, List<Schedule> s){ super(u,r,s);} }
    static class MetroService extends GenericService { MetroService(TransportUnit u, List<Route> r, List<Schedule> s){ super(u,r,s);} }
    static class TaxiService extends GenericService { TaxiService(TransportUnit u, List<Route> r, List<Schedule> s){ super(u,r,s);} }

    // Example of extension: FerryService (would implement TransportService)
    static class FerryService extends GenericService { FerryService(TransportUnit u, List<Route> r, List<Schedule> s){ super(u,r,s);} }

    // ---------- Main/demo ----------
    public static void main(String[] args) {
        // Seed routes
        Route r1 = new Route("R1","Central","Airport", 20.0, "BUS","TAXI");
        Route r2 = new Route("R2","Central","North", 8.0, "BUS","METRO");
        Route r3 = new Route("R3","North","Airport", 15.0, "TAXI","BUS");

        // Units
        Bus bus1 = new Bus("B1","CityBus-1",50);
        Metro metro1 = new Metro("M1","Metro-A",200);
        Taxi taxi1 = new Taxi("T1","Taxi-Alpha",4);
        Ambulance amb1 = new Ambulance("AMB1","Ambulance-1",2); // emergency-marked

        // FareCalculator implemented as lambda (functional interface)
        FareCalculator baseFareCalc = (route, unit) -> {
            double base = 10.0 + route.getDistanceKm() * 1.5;
            switch (unit.type()) {
                case "METRO": return base * 0.9;
                case "TAXI": return base * 1.8;
                default: return base;
            }
        };

        // Create schedules
        LocalDate today = LocalDate.now();
        List<Schedule> busSchedules = Arrays.asList(
            new Schedule("S1", r1, bus1, LocalDateTime.of(today, LocalTime.of(6,0)),
                         LocalDateTime.of(today, LocalTime.of(6,45)), baseFareCalc.calculateFare(r1, bus1)),
            new Schedule("S2", r2, bus1, LocalDateTime.of(today, LocalTime.of(9,0)),
                         LocalDateTime.of(today, LocalTime.of(9,25)), baseFareCalc.calculateFare(r2, bus1))
        );
        List<Schedule> metroSchedules = Arrays.asList(
            new Schedule("S3", r2, metro1, LocalDateTime.of(today, LocalTime.of(6,30)),
                         LocalDateTime.of(today, LocalTime.of(6,50)), baseFareCalc.calculateFare(r2, metro1))
        );
        List<Schedule> taxiSchedules = Arrays.asList(
            new Schedule("S4", r1, taxi1, LocalDateTime.of(today, LocalTime.of(7,0)),
                         LocalDateTime.of(today, LocalTime.of(7,30)), baseFareCalc.calculateFare(r1, taxi1)),
            new Schedule("S5", r3, taxi1, LocalDateTime.of(today, LocalTime.of(18,0)),
                         LocalDateTime.of(today, LocalTime.of(18,30)), baseFareCalc.calculateFare(r3, taxi1))
        );
        List<Schedule> emgSchedules = Arrays.asList(
            new Schedule("S_EMG", r1, amb1, LocalDateTime.of(today, LocalTime.of(8,0)),
                         LocalDateTime.of(today, LocalTime.of(8,20)), 0.0)
        );

        // Services (implementing TransportService)
        TransportService busService = new BusService(bus1, Arrays.asList(r1,r2), busSchedules);
        TransportService metroService = new MetroService(metro1, Collections.singletonList(r2), metroSchedules);
        TransportService taxiService = new TaxiService(taxi1, Arrays.asList(r1,r3), taxiSchedules);
        TransportService ambService = new GenericService(amb1, Arrays.asList(r1), emgSchedules);

        // All services registry
        List<TransportService> allServices = Arrays.asList(busService, metroService, taxiService, ambService);

        // ---------- Flow 1: Passenger books a trip -> filter & sort (lambda) ----------
        Passenger p = new Passenger("P1","Asha");
        String from = "Central", to = "Airport";
        String preferMode = "BUS"; // user's preference (could be any)

        System.out.println("=== Available options for " + p + " from " + from + " to " + to + " prefer=" + preferMode + " ===");

        // lambda: filter schedules that match route and allowed type and sort by earliest departure
        allServices.stream()
            .flatMap(svc -> svc.getSchedules().stream())
            .filter(sc -> sc.route.getFrom().equalsIgnoreCase(from) && sc.route.getTo().equalsIgnoreCase(to))
            .filter(sc -> sc.unit.type().equalsIgnoreCase(preferMode) || preferMode==null)
            .sorted(Comparator.comparing(s -> s.departure))
            .forEach(System.out::println); // method reference for printing

        // If none matched, show alternatives (example)
        boolean anyBusOption = allServices.stream()
                .flatMap(svc -> svc.getSchedules().stream())
                .anyMatch(sc -> sc.route.getFrom().equalsIgnoreCase(from) && sc.route.getTo().equalsIgnoreCase(to) && sc.unit.type().equalsIgnoreCase("BUS"));
        if(!anyBusOption) System.out.println("No direct BUS options — consider Taxi or Metro.");

        // ---------- Flow 2: Dashboard updates live -> forEach displays current active services ----------
        System.out.println("\n=== Live Dashboard: Active schedules (forEach) ===");
        allServices.stream()
            .flatMap(svc -> svc.getSchedules().stream())
            .filter(sch -> sch.departure.toLocalDate().equals(today))
            .forEach(sch -> System.out.println("Active: " + sch)); // method reference could be used too

        // ---------- Flow 3: Revenue reports -> collectors group and summarize data ----------
        System.out.println("\n=== Revenue & Usage Reports ===");

        List<Schedule> allSchedules = allServices.stream()
                .flatMap(svc -> svc.getSchedules().stream())
                .collect(Collectors.toList());

        // groupingBy route id -> list of schedules
        Map<String, List<Schedule>> byRoute = allSchedules.stream()
                .collect(Collectors.groupingBy(sch -> sch.route.getId()));
        byRoute.forEach((routeId, list) -> System.out.println(routeId + " trips: " + list.size()));

        // partitioningBy peak vs non-peak
        Map<Boolean, List<Schedule>> peakPartition = allSchedules.stream()
                .collect(Collectors.partitioningBy(Schedule::isPeak));
        System.out.println("Peak trips: " + peakPartition.get(true).size() + ", Off-peak trips: " + peakPartition.get(false).size());

        // summarizingDouble for fares
        DoubleSummaryStatistics stats = allSchedules.stream()
                .collect(Collectors.summarizingDouble(sch -> sch.fare));
        System.out.println("Revenue summary -> total: " + stats.getSum() + " mean: " + stats.getAverage() + " count:" + stats.getCount());

        // Top-used routes by count (stream + collectors)
        List<Map.Entry<String, Long>> topRoutes = allSchedules.stream()
                .collect(Collectors.groupingBy(sch -> sch.route.getId(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top routes: " + topRoutes);

        // ---------- Flow 4: System expansion example (FerryService) ----------
        System.out.println("\n=== Expansion: Add FerryService (example) ===");
        TransportUnit ferryUnit = new TransportUnit("F1","Ferry-1",150) { public String type(){ return "FERRY"; } };
        Route fr = new Route("RF1","Harbor","Island", 5.0, "FERRY");
        Schedule fs = new Schedule("FS1", fr, ferryUnit, LocalDateTime.of(today, LocalTime.of(10,0)), LocalDateTime.of(today, LocalTime.of(10,30)), 30.0);
        TransportService ferryService = new FerryService(ferryUnit, Arrays.asList(fr), Arrays.asList(fs));
        ferryService.printServiceDetails(); // default method used

        // ---------- Flow 5: Emergency scenario detection using Marker Interface ----------
        System.out.println("\n=== Emergency prioritization check ===");
        for (TransportService svc : allServices) {
            TransportUnit unit = svc.getUnit();
            if (unit instanceof EmergencyService) {
                // prioritize: print and show bypass capability
                System.out.println("PRIORITIZE (EMERGENCY): " + unit + " schedules:");
                svc.getSchedules().forEach(System.out::println);
            }
        }

        // ---------- Demonstrate method reference & static interface method ----------
        System.out.println("\nDistance example using GeoUtils.calculateDistanceKm:");
        double dist = GeoUtils.calculateDistanceKm("Central","Airport");
        System.out.println("Estimated distance Central->Airport = " + dist + " km");

        // Demonstrate default & static in interface
        System.out.println("Default speed: " + TransportService.defaultSpeedKmph() + " km/h");

        System.out.println("\nDemo complete.");
    }
}
