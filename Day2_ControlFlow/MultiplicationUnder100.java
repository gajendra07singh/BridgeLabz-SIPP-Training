import java.util.Scanner;

public class MultiplicationUnder100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=100;i>=1;i--){
            System.out.println("the table is"+n*i);
        }
    }
}
