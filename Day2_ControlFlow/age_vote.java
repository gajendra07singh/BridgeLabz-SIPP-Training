import java.util.Scanner;

public class age_vote {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("person can vote");
        }else{
            System.out.println("person cannot vote");
        }
    }
}
