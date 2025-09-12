import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "Critical: Patient needs immediate attention",
            "Appointment: Checkup scheduled at 5 PM",
            "General: New health tips available",
            "Critical: Emergency in ward 3",
            "Appointment: Surgery follow-up tomorrow"
        );

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hospital App Notification Filtering ===");
        System.out.println("Choose preference: critical / appointment / general");
        System.out.print("Enter preference: ");
        String preference = scanner.nextLine().toLowerCase();

        // 🔹 Using Predicate with Lambda
        Predicate<String> filter;

        switch (preference) {
            case "critical":
                filter = alert -> alert.startsWith("Critical");
                break;
            case "appointment":
                filter = alert -> alert.startsWith("Appointment");
                break;
            case "general":
                filter = alert -> alert.startsWith("General");
                break;
            default:
                System.out.println("⚠️ Invalid preference!");
                scanner.close();
                return;
        }

        System.out.println("\nFiltered Alerts (" + preference + "):");
        alerts.stream()
              .filter(filter)   // Apply predicate
              .forEach(System.out::println);

        scanner.close();
    }
}
