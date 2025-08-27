import java.util.Scanner;
public class StudentReport {
    String name;
    int rollno;
    double marks;
    char grade;
    public void SeeDetails(String name, int rollNo, double marks) {
        this.name   = name;
        this.rollno = rollNo;
        this.marks  = marks;
        CalculateGrade(name,  rollno,marks, grade);         
    }
    public static void CalculateGrade( String name, int rollno,double marks,char grade){
        if(marks>=90){
            System.out.println("A");
        }else if(marks>80){
            System.out.println("B");

        }else if(marks>=70){
            System.out.println("C");
        }else if(marks>=60){
            System.out.println("D");
        }else if(marks>=50){
            System.out.println("E");
        }else{
            System.out.println("F");
        }

      
    }
     public void displayDetails() {
        System.out.println("Student Name  : " + name);
        System.out.println("Roll Number   : " + rollno);
        System.out.println("Marks         : " + marks);
        System.out.println("Grade         : " + grade);
    }
    public static void main(String[] args) {
        StudentReport student =new StudentReport();
        Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();
        int rollno=sc.nextInt();
         double marks=sc.nextDouble();
         student.SeeDetails(name, rollno, marks);
         student.displayDetails();
    }
}
