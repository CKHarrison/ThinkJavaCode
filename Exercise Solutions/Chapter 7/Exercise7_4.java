public class Exercise7_4 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int num) {
        int result = 1;
        for(int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
        