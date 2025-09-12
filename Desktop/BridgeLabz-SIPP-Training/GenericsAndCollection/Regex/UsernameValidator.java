package Regex;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (username.matches(regex)) {
            System.out.println("Valid username");
        } else {
            System.out.println(" Invalid username");
        }

        scanner.close();
    }
}
