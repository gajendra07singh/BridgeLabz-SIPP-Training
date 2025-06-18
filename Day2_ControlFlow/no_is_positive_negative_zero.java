import java.util.Scanner;

public class no_is_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        if(number>=0){
            System.out.println("the no is positive");
        }else if(number<=0){
            System.out.println("the no is negative");
        }else{
            System.out.println("number is 0");
        }
    }
    
}
