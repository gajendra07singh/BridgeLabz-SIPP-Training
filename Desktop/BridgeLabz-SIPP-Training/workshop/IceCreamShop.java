class IceCream {
    String name;
    int soldCount;
    public int price;


    IceCream(String name, int soldCount) {
        this.name = name;
        this.soldCount = soldCount;
    }
    public void display() {
        System.out.println(name + " - Sold: " + soldCount + " times");
    }
}

public class IceCreamShop {
    public static void bubbleSort(IceCream[] flavors) {
        int n = flavors.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(flavors[j].soldCount < flavors[j + 1].soldCount) {
                    IceCream temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        IceCream[] flavors = {
            new IceCream("Vanilla", 120),
            new IceCream("Chocolate", 180),
            new IceCream("Strawberry", 90),
            new IceCream("Mango", 150),
            new IceCream("Butterscotch", 70),
            new IceCream("Pista", 130),
            new IceCream("Black Currant", 110),
            new IceCream("Orange", 60)
        };

      
        for(IceCream flavor : flavors) {
            flavor.display();
        }

        bubbleSort(flavors);

        for(IceCream flavor : flavors) {
            flavor.display();
        }
    }
}

