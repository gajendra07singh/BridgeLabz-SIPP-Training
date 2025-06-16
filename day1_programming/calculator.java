import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        int calculator = sc.nextInt();
      double Result= (num1+num2);
        double Result1= (num1-num2);
        double Result2= (num1*num2);
       double Result3= (num1/num2);

        switch (calculator) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result1 = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result2 = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result3 = " + (num1 / num2));
                } else {
                    System.out.println("num2 is always greater then 0");
                }
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}
