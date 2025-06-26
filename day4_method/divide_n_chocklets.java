import java.util.Scanner;

public class divide_n_chocklets {
    public static void divide(int n, int m){
        int remaining=n%m;
        int each =n/m;
        System.out.println(" number of chocolates each child gets"+each);
         System.out.println("the remaining chocklets "+remaining);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        divide(x,y);
    }
    
}
