import java.util.Scanner;

public class question11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInfeet= sc.nextDouble();
         System.out.print("Enter the distance in feet: ");
        double yard = distanceInfeet / 3;         
        double mile = yard / 1760;
        System.out.println("The distance in yards is"+yard + "while the distance in miles is "+mile);

    }
}