import java.util.Scanner;

public class DivideChockletsToChildren {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
         int noofchoclate= sc.nextInt();
      int noofchildren= sc.nextInt();
        int  eachchild=noofchoclate/noofchildren;
        int  noofremaining=noofchoclate%noofchildren;
        System.out.println("The number of chocolates each child gets is"+ eachchild+" and the number of remaining chocolates is"+noofremaining);
    }
    
}
