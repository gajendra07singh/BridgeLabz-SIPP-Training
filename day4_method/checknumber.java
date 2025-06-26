import java.util.Scanner;

public class checknumber {
    public static int checknumber(int n){
         if(n<0){
            return -1;
         }else if(n==0){
            return 0;

         }else{
            return 1;
         }
    }
          public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
          int n=sc.nextInt();
          int result = checknumber(n);
          if(result==-1){
            System.out.println("the no is negative");
          }else if(n==0){
            System.out.println("the no is zero");
          }else{
            System.out.println("the no is positive");
          }

        }
}
