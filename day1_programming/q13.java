import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
         int b= sc.nextInt();
          int c = sc.nextInt();
          int result =a+b*c;
          int result1 = a*b+c;
          int result2 = c+a/b;
          int result3= a%b+c;
           System.out.println("a + b * c = " + result);
        System.out.println("a * b + c = " + result1);
        System.out.println("c + a / b = " + result2);
        System.out.println("a % b + c = " + result3);

    }
    
}
