import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double km= sc.nextDouble();
      double miles=km*0.625;
      System.out.println("The total miles is "+ miles+"mile for the given"+ km);
    }
    
}
