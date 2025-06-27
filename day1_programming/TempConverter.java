import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celcius= sc.nextDouble();
        double temperatureinf=(celcius*9/5)+32;
        System.out.println("the"+celcius+" celsius is "+ temperatureinf+ " fahrenheit");
    }
}

