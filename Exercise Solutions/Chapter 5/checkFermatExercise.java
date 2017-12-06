public class checkFermatExercise {
    public static void checkFermat(int a, int b, int c, int n) {
        int aPower = (int) Math.pow(a, n);
        int bPower = (int) Math.pow(b, n);
        int cPower = (int) Math.pow(c, n);
        
        if(n > 2 && aPower + bPower == cPower) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work");
        }
    }
    public static void main(String[] args) {
        checkFermat(15, 2, 3, 4);
    }
}
        