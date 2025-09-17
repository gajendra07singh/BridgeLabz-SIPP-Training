import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();
        String msg = "Hello World";
        System.out.println("Length: " + lengthFunc.apply(msg));
    }
}