import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        String filename = "employees.ser";
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "IT", 60000));
        employees.add(new Employee(2, "Bob", "HR", 50000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            for (Employee emp : list) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
