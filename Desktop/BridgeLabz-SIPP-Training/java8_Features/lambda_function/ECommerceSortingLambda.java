import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: $" + price + " | Rating: " + rating + "⭐ | Discount: " + discount + "%";
    }
}

public class ECommerceSortingLambda {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800, 4.5, 10));
        products.add(new Product("Phone", 500, 4.8, 15));
        products.add(new Product("Headphones", 100, 4.2, 20));
        products.add(new Product("Monitor", 300, 4.3, 5));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== E-Commerce Product Sorting ===");
        System.out.println("1. Sort by Price (Low → High)");
        System.out.println("2. Sort by Rating (High → Low)");
        System.out.println("3. Sort by Discount (High → Low)");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        // 🔹 Using lambda directly inside sort()
        if (choice == 1) {
            products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        } else if (choice == 2) {
            products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        } else if (choice == 3) {
            products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        } else {
            System.out.println("⚠️ Invalid choice!");
            scanner.close();
            return;
        }

        // Printing sorted list
        System.out.println("\nSorted Products:");
        products.forEach(p -> System.out.println(p));

        scanner.close();
    }
}
