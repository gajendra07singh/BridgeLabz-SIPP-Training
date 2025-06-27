import java.util.Scanner;

public class AtheletRuns {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
         int side1= sc.nextInt();
         int side2= sc.nextInt();
         int side3= sc.nextInt();
         int perimeteroftraingle=side1+side2+side3;
         int distance=5000;
         int round= distance/perimeteroftraingle;
         System.out.println("The total number of rounds the athlete will run is"+round+" to complete 5 km");
    }
    
}
