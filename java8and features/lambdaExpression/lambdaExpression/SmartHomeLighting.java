import java.util.function.Consumer;

public class SmartHomeLighting {
    public static void main(String[] args) {
        Consumer<String> motionTrigger = (event) -> System.out.println("Motion detected! Lights ON.");
        Consumer<String> timeTrigger = (event) -> System.out.println("It's evening! Warm lights ON.");
        Consumer<String> voiceTrigger = (event) -> System.out.println("Voice Command: Lights OFF.");

        motionTrigger.accept("motion");
        timeTrigger.accept("time");
        voiceTrigger.accept("voice");
    }
}