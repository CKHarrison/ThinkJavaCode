public class Exercise6_9 {
    public static void main(String[] args) {
        System.out.println(power(2.0, 80));
    }
    public static double power(double x, int n) {
//        double dn = (double)n;
//        Original Exercise
//        return x * Math.pow(x, (n - 1));
        
//        Optional Exercise
        double temp = Math.pow(x, (n/2));
        return Math.pow(temp, 2);
    }
}
                           
