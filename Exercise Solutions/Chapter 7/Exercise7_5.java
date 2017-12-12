//Didn't finish this exercise. Found the phrasing of questions too confusing to understand

public class Exercise7_5 {
    public static void main(String[] args) {
        //Insert code
       check(1);
    }
    public static double myexp(double num) {
       double numerator = 1;
    double result = 1;
    double denominator = 1;
    for (double i = 1; i < num; i++) {
      numerator += numerator * num;
      denominator /= i;
      result += (numerator/denominator);
      }
        return result;
    }
    public static void check(double x) {
         System.out.println(x + "\t" + myexp(x) + "\t" + Math.exp(x));
    }
    public static int factorial(int num) {
        int result = 1;
        for(int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}