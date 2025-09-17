import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(30, 75, 60, 90);
        readings.stream()
                .filter(r -> r > 70)
                .forEach(r -> System.out.println("High reading: " + r));
    }
}