package Exeption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "info.txt";

        // try-with-resources ensures the file is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            
            // Read the first line
            String firstLine = reader.readLine();
            
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("The file is empty.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
