package Exeption;

public class ExceptionPropagationDemo {

   
    public static void method1() {
        System.out.println("Inside method1...");
        int result = 10 / 0; 
        System.out.println("Result: " + result); 
    }

    
    public static void method2() {
        System.out.println("Inside method2...");
        method1();
        System.out.println("Exiting method2...");
    }

   
    public static void main(String[] args) {
        System.out.println("Program started...");

        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }

        System.out.println("Program continues after handling exception...");
    }
}
