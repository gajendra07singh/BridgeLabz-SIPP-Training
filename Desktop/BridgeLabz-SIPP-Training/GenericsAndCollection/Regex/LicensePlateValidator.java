package Regex;

import java.util.Scanner;

public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Z]{2}[0-9]{4}$";

        System.out.print("Enter a license plate number: ");
        String plate = scanner.nextLine();

        if (plate.matches(regex)) {
            System.out.println(" Valid license plate");
        } else {
            System.out.println(" Invalid license plate");
        }

        scanner.close();
    }
}

