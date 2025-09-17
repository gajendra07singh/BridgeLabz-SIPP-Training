import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String filename = "students.dat";

        // Write data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(1);
            dos.writeUTF("Alice");
            dos.writeDouble(8.7);

            dos.writeInt(2);
            dos.writeUTF("Bob");
            dos.writeDouble(9.1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
