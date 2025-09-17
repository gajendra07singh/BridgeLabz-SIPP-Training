import java.util.*;
import java.util.stream.*;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world java java";
        String[] words = paragraph.split(" ");
        
        Map<String, Integer> frequency = Arrays.stream(words)
            .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
        
        System.out.println(frequency);
    }
}