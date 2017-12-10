public class IsTriangle {
    public static void main(String[] args) {
       boolean result = isTriangle(1, 2, 3);
       System.out.println(result);
    }
    public static boolean isTriangle(int a, int b, int c) {
        if(a > b + c) {
            return false;
        }
        else if(b > a + c) {
            return false;
        }
        else if(c > a + b) {
            return false;
        }
        else {
            return true;
        }
    }
}