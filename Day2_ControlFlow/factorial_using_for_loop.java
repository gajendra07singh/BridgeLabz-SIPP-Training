import java.util.Scanner;

public class factorial_using_for_loop {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("factorailis not for negative no");
        }else{
           int fact=1;
           int i;
           for(i=1;i<=n;i++){
            fact*=i;
           }
            System.out.println(fact);
        }
    }
}
