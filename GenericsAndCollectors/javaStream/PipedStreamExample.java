import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;
    public WriterThread(PipedOutputStream pos) { this.pos = pos; }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                pos.write(("Message " + i + "\n").getBytes());
                pos.flush();
                Thread.sleep(500);
            }
            pos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;
    public ReaderThread(PipedInputStream pis) { this.pis = pis; }
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(pis))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Received: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        new WriterThread(pos).start();
        new ReaderThread(pis).start();
    }
}
