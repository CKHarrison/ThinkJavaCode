public class Countup {
    public static void main(String[] args) {
        System.out.println("Countup beginning");
        countup(3);
    }
        public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }
}