import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float add=a+b;
        float sub= a-b;
        float mul =a*b;
        float div=a/b;
        System.out.println("The addition of two numbers is: " + add);
        System.out.println("The subtraction of two numbers is: " + sub);
        System.out.println("The multiplication of two numbers is: " + mul);
        System.out.println("The division of two numbers is: " + div);
       
    }
    
}

