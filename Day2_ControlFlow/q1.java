<<<<<<< HEAD
=======
// Which Spring is it?
>>>>>>> 83abaa7b170cea5f78996bb3b27f1b9fd7f4a3f9
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int month=sc.nextInt();
         int day=sc.nextInt();
           boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);

         if(isSpring){
            System.out.println("it is Spring season");
         }else{
            System.out.println("its not Spring season");
         }
        
    }
}
