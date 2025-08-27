import java.util.Scanner;

public class EmployeeDetails{
    String name;
    int id;
    double salary;
    
    public static void details(){
        Scanner sc= new Scanner(System.in);
       String name=sc.nextLine();
       int id=sc.nextInt();
       double salary= sc.nextDouble();
         System.out.println("Employee datials  ");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary in rupees : "+ salary);
    }
    

    public static void main(String[] args) {
        EmployeeDetails Employee=new EmployeeDetails();
       Employee.details();   
    }
}