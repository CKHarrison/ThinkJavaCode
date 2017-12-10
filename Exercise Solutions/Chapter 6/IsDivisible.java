public class IsDivisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(10, 5));
    }
    public static boolean isDivisible(int n, int m) {
        if(n % m == 0) {
            return true;
        }
        return false;
    }
}