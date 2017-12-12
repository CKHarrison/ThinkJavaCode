public class Multadd {
    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));
        
        double a = Math.cos(Math.PI/4);
        double b = 0.5;
        double c = Math.sin(Math.PI/4);
        System.out.println(multadd(a, b, c));
        
        double a1 = 1;
        double b1 = Math.log(20);
        double c1 = Math.log(20);
        System.out.println(multadd(a1, b1, c1));
        
        //expSum
        System.out.println(expSum(2));
        
    }
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    
    public static double expSum(double x) {
        double a2 = x;
        double b2 = Math.exp(-x);
        double c2 = Math.sqrt(1 - Math.exp(-x));
        return multadd(a2, b2, c2);
    }
                              
}