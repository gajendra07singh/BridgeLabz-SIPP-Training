import java.util.Scanner;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int number = sc.nextInt();

        ArrayList<Integer> factorList = new ArrayList<>();

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorList.add(i); 
            }
        }
        int[] factors = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            factors[i] = factorList.get(i);
        }
        System.out.println("Factors of " + number + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
    }
}
 