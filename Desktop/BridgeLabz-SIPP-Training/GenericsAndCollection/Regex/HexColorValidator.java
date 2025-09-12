package Regex;
import java.util.Scanner;

public class HexColorValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regex:
        // ^# → must start with #
        // [A-Fa-f0-9]{6}$ → followed by exactly 6 hex characters
        String regex = "^#[A-Fa-f0-9]{6}$";

        System.out.print("Enter a hex color code: ");
        String color = scanner.nextLine();

        if (color.matches(regex)) {
            System.out.println(" Valid hex color code");
        } else {
            System.out.println(" Invalid hex color code");
        }

        scanner.close();
    }
}

