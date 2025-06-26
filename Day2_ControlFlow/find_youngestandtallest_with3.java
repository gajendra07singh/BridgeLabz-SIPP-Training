import java.util.Scanner;

public class find_youngestandtallest_with3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age1=sc.nextInt();
         int height1 =sc.nextInt();
           int age2=sc.nextInt();
         int height2 =sc.nextInt();
           int age3=sc.nextInt();
         int height3 =sc.nextInt();
         String small="";
         String  largest="";

         if(age1<age2&&age1<age3){
           small="amar";
         }else if(age2<age1&&age2<age3){
              System.out.println("the smallest person is"+largest);
                 small="akabar";
                 }
         else if(age3<age2&&age3<age1){
            small="anthony";
         }else{
            System.out.println("there is no big ");
         }
         if(height1>height2&&height1>height3){
            largest="amar";
         }else if(height2>height1&&height2>height3){
            largest="akbar";
         }else if(height3>height1&&height3>height2){
            largest="anthony";
         }else{
            System.out.println("there is no big");
         }
         System.out.println("the small person is"+small);
         System.out.println("the largest person is "+largest);

    }
}
