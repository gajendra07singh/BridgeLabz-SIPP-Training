import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fahernheit= sc.nextDouble();
        double temperaturecelcius = (fahernheit-32)*5/9;
        System.out.println("the"+ fahernheit+ "fahernheit is"+temperaturecelcius);
    }
}
