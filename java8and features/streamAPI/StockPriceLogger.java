import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(100.5, 102.3, 98.7);
        prices.forEach(System.out::println);
    }
}