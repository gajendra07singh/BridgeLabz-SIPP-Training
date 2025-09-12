// Functional Interface
@FunctionalInterface
interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {

        
        LightAction motionTrigger = () -> 
            System.out.println("💡 Motion detected → Turning ON hallway lights.");

       
        LightAction timeTrigger = () -> 
            System.out.println("🌅 Evening time → Dimming living room lights.");

       
        LightAction voiceTrigger = () -> 
            System.out.println("🎤 Voice command → Switching OFF bedroom lights.");

       
        System.out.println("=== Smart Home Lighting Automation ===");
        motionTrigger.execute();
        timeTrigger.execute();
        voiceTrigger.execute();
    }
}

