import java.util.Scanner;

//Converting Celsius to Fahrenheit

public class SecondsToHours {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double userSeconds, hours, minutes, seconds ;
        
        // prompt the user for number of seconds and get the value
        System.out.print("Please input number of seconds: ");
        userSeconds = in.nextInt();
        
        //Convert and output the result
        minutes = userSeconds/60;
        hours = (minutes/60);
        seconds = userSeconds % 60;
       
        System.out.printf("%.3f hours, %.0f minutes, and %.0f seconds \n",
                          hours, minutes, seconds);
    }
}