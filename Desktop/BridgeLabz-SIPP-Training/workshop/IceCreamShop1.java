class icecream {
    String name;
    int price;
    public icecream(String name,int price){
        this.name=name;
        this.price=price;
    }
    public  void display(){
        System.out.println("name of ice cream is "+ name+"the price is "+price);

    }
}
public class IceCreamShop1 {
    public void Sort(IceCream[] arr){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].price>arr[j+1].price){
                    IceCream temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        icecream [] ice1 = {new icecream("mango", 50),
         new icecream("banana", 70),
        new icecream("strawbery", 80),
        new icecream("pineapple", 90),
         new icecream("orange", 10),
        new icecream("papaya", 20),
       new icecream("venela", 100),
       new icecream("apple", 60)
        };
      
       IceCreamShop1 shop = new IceCreamShop1();
        shop.Sort(null);
        System.out.println("Sorted Ice Creams by Price (Low to High):");
        for (icecream ic : ice1) {
            ic.display();
        }
    }
}

