import java.util.*;
public class conditions {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("a is equals to b");
        }else
        if(a > b){
             System.out.println("a is greater to b");
        }
        else{
             System.out.println("a is less then  to b");
        }
    }
}   