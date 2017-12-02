import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        int userNumber;
        int difference;
        
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        //Ask user for number
        System.out.println("Please Enter a number between 0 and 100 ");
        Scanner in = new Scanner(System.in);
        userNumber = in.nextInt();
        difference = number - userNumber;
        System.out.println("The difference between the computer's number and your number is " + difference);
        System.out.println("Computer's number: " + number + ", Your number: " + userNumber);
        //System.out.println(number);
    }

}
