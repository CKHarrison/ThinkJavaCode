public class Exercise7_2 {
    public static void main(String[] args) {
        System.out.printf("%.2f\n", squareRoot(25));
    }
    
    public static double squareRoot(double num) {
        double a = num/2;
        while(Math.abs(a - Math.sqrt(num)) > 0.0001) {
            a = (a + (num/a))/2;
        }
              return a;
    }
}
