import java.util.Scanner;

public class SumOfNaturalNoLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int sum = 0;
            int i = 1;
            for(i=1;i<=n;i++)
            sum +=i;
            System.out.println("Factorial of " + n + " is: " + sum);
        }
    }
}
