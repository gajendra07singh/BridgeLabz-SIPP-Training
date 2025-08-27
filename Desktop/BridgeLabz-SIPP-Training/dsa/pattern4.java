public class pattern4 {
    public static void main(String[] args) {
        int i;
        int j;
        int n=4 ;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
}
