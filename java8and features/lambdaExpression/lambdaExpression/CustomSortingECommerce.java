import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " - Price: " + price + ", Rating: " + rating + ", Discount: " + discount + "%";
    }
}

public class CustomSortingECommerce {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 50000, 4.5, 10),
            new Product("Phone", 20000, 4.7, 15),
            new Product("Tablet", 15000, 4.3, 5)
        );

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}