import java.util.Scanner;

public class CheckInventory {
    public static void item(int quantity,int itemCode ,String itemName,int price){
        System.out.println("the quantity is "+quantity);
         System.out.println("the itemcode is "+itemCode);
         System.out.println("the itemname is "+itemName);
         System.out.println("the price is "+price);
         int cost = quantity*price;
         System.out.println("the cost of item is "+cost);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int quantity=sc.nextInt();
        int itemCode=sc.nextInt();
         sc.nextLine();
        String itemName=sc.nextLine();
        int price=sc.nextInt();
        item(quantity, itemCode, itemName, price);
    }
}
