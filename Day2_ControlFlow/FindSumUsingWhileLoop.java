import java.util.Scanner;

public class FindSumUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
         int sum = 0;
        while (true) {
             int n = sc.nextInt();
            if (n <= 0) {
                break;
            }
            sum += n;
        }
        System.out.println("The total sum is: " + sum);
    }
}