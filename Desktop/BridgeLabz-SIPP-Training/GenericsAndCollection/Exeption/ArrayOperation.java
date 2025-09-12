package Exeption;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

          
            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

           
            System.out.print("Enter index to retrieve value: ");
            int index = scanner.nextInt();

          
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range.");
        } catch (NullPointerException e) {
            System.out.println("Error: Array is null.");
        } finally {
            scanner.close();
        }
    }
}

