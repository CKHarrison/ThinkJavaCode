public class Exercise7_6 {
    public static void main(String[] args) {
        System.out.println(gauss(1.0, 4.0));
    }
    public static double gauss(double x, double n) {
        double result = 1;
        double numerator = 1;
        double denominator = 1;
        
        for(double i = 1; i < n; i++) {
            numerator = (numerator - 1)*x * x;
            denominator = denominator * i;
            result += numerator/denominator;
        }
        return result;
    }
}