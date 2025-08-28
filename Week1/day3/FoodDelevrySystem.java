
class Customer {
    String name;
    String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
    }
}

class Restaurant {
    String name;
    String location;

    Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void display() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Restaurant Location: " + location);
    }
}

class DeliveryBoy {
    String name;
    String contact;

    DeliveryBoy(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    void display() {
        System.out.println("Delivery Boy Name: " + name);
        System.out.println("Delivery Boy Contact: " + contact);
    }
}

class Order {
    int orderId;
    Customer customer;       
    Restaurant restaurant;  
    DeliveryBoy deliveryBoy; 

    Order(int orderId, Customer customer, Restaurant restaurant, DeliveryBoy deliveryBoy) {
        this.orderId = orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.deliveryBoy = deliveryBoy;
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        customer.display();
        restaurant.display();
        deliveryBoy.display();
    }
}
