package Exeption;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Asking user for two numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Division operation
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            // Handle invalid input (non-numeric)
            System.out.println("Error: Please enter valid numbers only.");
        } finally {
            // Closing scanner
            scanner.close();
        }
    }
}
