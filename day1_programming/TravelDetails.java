import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();
        double fromToVia = sc.nextDouble();
        double viaToFinalCity = sc.nextDouble();
        int timeFromToVia = sc.nextInt();
        int timeViaToFinalCity = sc.nextInt();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934; // Convert miles to kilometers
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistanceKm + " km and the total time taken is " + totalTime + " minutes.");
    }
}
