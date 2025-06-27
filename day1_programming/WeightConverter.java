import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight= sc.nextDouble();
        double weightinkg= 0.45*weight;
        System.out.println(" The weight of the person in pounds is "+ weight+ "_ and in kg is "+ weightinkg );
       
    }
}
