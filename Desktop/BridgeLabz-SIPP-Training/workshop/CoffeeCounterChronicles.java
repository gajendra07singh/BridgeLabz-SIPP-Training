import java.util.Scanner;

public class CoffeeCounterChronicles {
    
    private static int espressoCount = 0;
    private static int latteCount = 0;
    private static int cappuccinoCount = 0;
    
    public static void showMenu() {
        System.out.println("\n--- Coffee Counter Chronicles ---");
        System.out.println("1. Order Espresso");
        System.out.println("2. Order Latte");
        System.out.println("3. Order Cappuccino");
        System.out.println("4. View Sales Summary");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    } 
    public static void orderCoffee(int choice) {
        switch (choice) {
            case 1:
                espressoCount++;
                System.out.println("You ordered an Espresso.");
                break;
            case 2:
                latteCount++;
                System.out.println("You ordered a Latte.");
                break;
            case 3:
                cappuccinoCount++;
                System.out.println("You ordered a Cappuccino.");
                break;
            case 4:
                showSalesSummary();
                break;
            case 5:
                System.out.println("Thank you for visiting the Coffee Counter!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    public static void showSalesSummary() {
        int total = espressoCount + latteCount + cappuccinoCount;
        System.out.println("\n--- Sales Summary ---");
        System.out.println("Espresso Sold   : " + espressoCount);
        System.out.println("Latte Sold      : " + latteCount);
        System.out.println("Cappuccino Sold : " + cappuccinoCount);
        System.out.println("Total Coffees Sold: " + total);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            orderCoffee(choice);
        } while (choice != 5);
    }
}
