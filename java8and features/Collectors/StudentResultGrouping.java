import java.util.*;
import java.util.stream.*;
public class StudentResultGrouping {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice-Grade1", "Bob-Grade2", "Charlie-Grade1", "David-Grade2", "Eve-Grade3");
        
        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(s -> s.split("-")[1]));
        
        System.out.println(grouped);
    }
}