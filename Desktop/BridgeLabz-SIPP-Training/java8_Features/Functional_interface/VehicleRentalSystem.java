package Functional_interface;

// Interface definition
interface Vehicle {
    void rent();
    void returnVehicle();
}

// Implementation: Car
class Car implements Vehicle {
    @Override
    public void rent() {
        System.out.println("🚗 Car has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("🚗 Car has been returned.");
    }
}

// Implementation: Bike
class Bike implements Vehicle {
    @Override
    public void rent() {
        System.out.println("🏍️ Bike has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("🏍️ Bike has been returned.");
    }
}

// Implementation: Bus
class Bus implements Vehicle {
    @Override
    public void rent() {
        System.out.println("🚌 Bus has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("🚌 Bus has been returned.");
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create objects
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        System.out.println("=== Multi-Vehicle Rental System ===");
        
        // Renting vehicles
        car.rent();
        bike.rent();
        bus.rent();

        // Returning vehicles
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}

