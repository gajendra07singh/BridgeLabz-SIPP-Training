import java.util.Scanner;

public class AtheleterunsProblem {
    public static double atheleteruns(int side1,int side2,int side3){
        int perimeter = side1+side2+side3;
         int distance=5000;
        int round =distance/perimeter;
        return round;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        double result = atheleteruns(side1,side2,side3);
        System.out.println("the no of round complete by athelete is "+result);

    }
}
