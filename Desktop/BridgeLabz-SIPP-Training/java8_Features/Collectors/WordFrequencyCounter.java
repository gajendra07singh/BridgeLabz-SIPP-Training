package Collectors;

import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "Java is powerful and Java is versatile. "
                         + "Streams make Java powerful for data processing.";

        String[] words = paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

       
        Map<String, Integer> wordCount = Arrays.stream(words)
            .collect(Collectors.toMap(
                word -> word,          
                word -> 1,            
                Integer::sum          
            ));

       
        System.out.println("=== Word Frequency Counter ===");
        wordCount.forEach((word, count) -> 
            System.out.println(word + " → " + count));
    }
}
