import java.util.Scanner;

public class AreaOfCircle {
    int radius;
    public static Double Area(int radius){
       return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int radius =sc.nextInt();
        Double result= Area( radius);
        System.out.println(result);
    }
}
