import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = temp -> temp > 37.5;
        System.out.println("Is fever? " + highTemp.test(38.0));
    }
}