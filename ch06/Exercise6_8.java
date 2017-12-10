public class Exercise6_8 {
    public static void main(String[] args) {
        System.out.println(ack(3,2));
    }
    public static int ack(int m, int n) {
        if(m == 0) {
            return n + 1;
        }
        if(m > 0 && n == 0) {
            return ack(m - 1, 1);
        }
        if(m > 0 && n > 0) {
            return ack(m -1, ack(m, n - 1));
            //return 0 if n or m is less than 0;
        } else {
            return 0;
        }
    }
        
}