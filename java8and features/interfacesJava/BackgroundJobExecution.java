public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Background task executed!");
        Thread thread = new Thread(task);
        thread.start();
    }
}