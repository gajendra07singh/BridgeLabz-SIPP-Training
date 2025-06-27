public class volume {
    public static void main(String[] args) {
        double radiuskm =6378;
        double pi=Math.PI;
        double radiusmiles =radiuskm*0.6213;
         double volumekm3 = (4/3)*pi*Math.pow(radiuskm,3);
         double volumemiles3 =(4/3)*pi*Math.pow(radiusmiles,3);
         System.out.println("The volume of earth in cubic kilometers is"+ volumekm3+ "and cubic miles is "+ volumemiles3 );
    }
    
}
