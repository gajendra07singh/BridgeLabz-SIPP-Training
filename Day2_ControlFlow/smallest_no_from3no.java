import java.util.Scanner;

public class smallest_no_from3no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        boolean Small=(n1<n2)&&(n1<n3);
        System.out.println(" Is the first number the smallest? ___"+Small);

    }
}
