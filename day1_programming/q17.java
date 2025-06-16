import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
         Scanner sc =new Scanner (System.in);
         double principal= sc.nextDouble();
        double rate= sc.nextDouble();
        double time= sc.nextDouble();
        double si= (principal*time*rate)/100;
        System.out.println(" The Simple Interest is "+si+"for principal"+principal+"for time"+time+"for rate"+rate);
    }
    
}
