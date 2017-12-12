public class Exercise7_3{
    public static void main(String[] args) {
        //Something
        System.out.println(power(4,2));
    }
    public static double power(double x, int n) {
        double result = x;
        for(int i =1; i < n; i++) {
            result *= result;
        }
        return result;
    }
}