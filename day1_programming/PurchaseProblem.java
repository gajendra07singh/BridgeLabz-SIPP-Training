import java.util.Scanner;

public class PurchaseProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitprice= sc.nextDouble();
        double quantity= sc.nextDouble();
        double totalpurchase=unitprice*quantity;
        System.out.println("The total purchase price is INR"+totalpurchase+ "if the quantity"+quantity+" and the unit price is INR"+unitprice);

    }

    
}
