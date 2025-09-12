import java.util.Scanner;

public class Array_Multiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        int[] multiplication= new int[4];
        int index=0;
        for(int i=6;i<=9;i++){
           multiplication[index] = number * i;
            index++;
        }
        index=0;
        for (int i=6;i<=9;i++){
           System.out.println(number + " * " + i + " = " + multiplication[index]);
            index++;
        }
        
    }
}
