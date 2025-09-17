interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
    public void displayBattery() { System.out.println("Battery: 70%"); }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard car = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
    }
}