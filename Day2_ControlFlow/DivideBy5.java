import java.util.Scanner;

public class DivideBy5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("is the no "+n+"divisible by 5? yes");
        }else{
            System.out.println("no is not divisible by 5? no ");
        }
    }
    
}
