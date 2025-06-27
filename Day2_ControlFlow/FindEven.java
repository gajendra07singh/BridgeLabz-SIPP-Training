import java.util.Scanner;

public class FindEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("the no is even");
        }else{
            int i=1;
            for( i=1;i<=n;i++){
                if(i%2==0){
                      System.out.println("the no is even");
                }else{
                    System.out.println("the no is odd");
                }
            }
        }
    }
}
