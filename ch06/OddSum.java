public class OddSum {
    public static void main(String[] args) {
        System.out.println(oddSum(15));
    }
    public static int oddSum(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        } else {        
           return oddSum(n-2) + n;
        }
    }
}