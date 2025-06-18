import java.util.Scanner;
public class sum_until_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n;
        double total=0.0;
        n= sc.nextDouble();
        while(n!=0){
             total += n; 
            System.out.println("Current Total: " + total);
            System.out.println("Enter another num5");
            n = sc.nextDouble();
        }
    }
}
