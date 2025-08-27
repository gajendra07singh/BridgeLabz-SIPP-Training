import java.util.Scanner;

public class DisplayBookDetails {
    public static void Book( String title ,String author,int price){
        System.out.println("the title of book is "+title);
        System.out.println("the author name is "+author);
        System.out.println("the price of book is"+price);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String title=sc.nextLine();
        String author =sc.nextLine();
        int price = sc.nextInt();
        Book( title , author, price);
    }
}
