package Collectors;
import java.util.*;
import java.util.stream.*;
    
class Order {
    String customerName;
    double amount;

    public Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 250.0),
            new Order("Bob", 120.5),
            new Order("Alice", 300.0),
            new Order("Charlie", 150.75),
            new Order("Bob", 80.25),
            new Order("Alice", 100.0)
        );

        Map<String, Double> revenueSummary = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomerName, 
                Collectors.summingDouble(Order::getAmount)
            ));

        System.out.println("=== Order Revenue Summary ===");
        revenueSummary.forEach((customer, total) -> 
            System.out.println(customer + " → $" + total));
    }
}
