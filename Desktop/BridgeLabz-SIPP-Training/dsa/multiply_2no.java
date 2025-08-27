import java.util.Scanner;

public class multiply_2no {
    public static int multiplication(int a,int b){
        return a*b;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int mul=multiplication(a,b);
        System.out.println(mul);

    }
}
