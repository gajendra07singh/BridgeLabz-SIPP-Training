import java.util.Scanner;

public class PalindromeCheckerSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
