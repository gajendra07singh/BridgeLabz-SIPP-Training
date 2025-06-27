import java.util.Scanner;

public class Areaoftriangleinchies {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        double base= sc.nextDouble();
        double height= sc.nextDouble();
        double areaoftriangleinchies =0.5*base*height;
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;
        double  areaoftriangleincm =0.5* baseInInches*heightInInches;
        System.out.println("The Area of the triangle in sq inchies is"+areaoftriangleinchies+" and sq cm is "+areaoftriangleincm );

    }
    
}
