import java.util.Scanner;

public class multiplication_using_while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=n-1;
         int result=1;
        if(n<=0||n>=100){
            System.out.println("it is positvive integer");
            return;
        }
        int multiple = n;
        while (multiple < 100) {
            System.out.println(multiple);
            multiple += n;
        }
    }
}