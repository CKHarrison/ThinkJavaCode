public class OneStatement {
    public static void main(String[] args){
        positiveSingleDigit(4);
    }
    public static void positiveSingleDigit(int num) {
        if(num > 0 && num < 10){
            System.out.println("Positive single digit number.");
        }
    }
}