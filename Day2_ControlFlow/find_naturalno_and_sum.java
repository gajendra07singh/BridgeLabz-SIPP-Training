import java.util.Scanner;

public class find_naturalno_and_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum =0;
         if(n>0){
            for(int i=1;i<=n;i++){
                sum +=i;
            }
            System.out.println("it is natural no and sum is"+sum);
            
         }else{
            System.out.println("it is not natural no");
         }
    }
}
