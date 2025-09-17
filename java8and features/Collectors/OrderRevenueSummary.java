import java.util.*;
import java.util.stream.*;
class Order {
    String customer;
    double total;
    Order(String c, double t) { customer = c; total = t; }
    String getCustomer() { return customer; }
    double getTotal() { return total; }
}
public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 200.5),
            new Order("Bob", 150.0),
            new Order("Alice", 300.0)
        );
        
        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));
        
        System.out.println(revenue);
    }
}