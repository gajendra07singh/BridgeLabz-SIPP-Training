import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double fee = sc.nextDouble();
        double discountpercent = sc.nextDouble();
       double discountAmount = (fee * discountpercent) / 100;
    double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);

    }
    
}
