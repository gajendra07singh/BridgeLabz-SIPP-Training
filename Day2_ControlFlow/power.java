import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int p=sc.nextInt();
         int result=1;
         int count=0;
       while (count < p) {
            result *= n;
            count++;
        }
        System.out.println("power"+p+"is"+result);

    }
}
