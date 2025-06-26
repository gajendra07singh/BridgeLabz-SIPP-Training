import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (greater than 0).");
        } else {
            int i = 1;
            int sumWhile = 0;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula : " + sumFormula);

            if (sumWhile == sumFormula) {
                System.out.println(" Both results are equal. ");
            } else {
                System.out.println(" Results do not match.");
            }
        }
    }
}
