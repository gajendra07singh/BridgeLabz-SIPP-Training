package Functional_interface;

// Interface definition
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Implementation: Light
class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("💡 Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("💡 Light is turned OFF.");
    }
}

// Implementation: Air Conditioner
class AC implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("❄️ AC is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("❄️ AC is turned OFF.");
    }
}

// Implementation: Television
class TV implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("📺 TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("📺 TV is turned OFF.");
    }
}

// Main Class
public class SmartHome {
    public static void main(String[] args) {
        // Create device objects
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        // Control devices
        System.out.println("=== Smart Home Control ===");
        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
