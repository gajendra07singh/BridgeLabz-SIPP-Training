package Exeption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String fileName = "data.txt"; // File to be read

        try {
            // Open the file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            // Handle the exception when file not found or cannot be read
            System.out.println("File not found");
        }
    }
}
