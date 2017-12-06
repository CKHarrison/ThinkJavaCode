import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        findUserNumber(randomNumber);
    }
    public static void findUserNumber(int randomNumber) {
        System.out.println("Please Enter a number between 0 and 100 ");
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        System.out.printf("Your number is: %d\n", userNumber);
        checkDifference(userNumber, randomNumber);
    }
    
    public static void checkDifference(int userNumber, int randomNumber) {
        if(userNumber == randomNumber) {
            System.out.println("Your number is correct!");
        }
        else if(userNumber > randomNumber) {
            System.out.println("Your number is too high, guess again!");
            findUserNumber(randomNumber);
        } else {
            System.out.println("Your number is too low, guess again!");
            findUserNumber(randomNumber);
        }
    }
}
