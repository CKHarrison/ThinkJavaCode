import java.util.Scanner;

//Converting Celsius to Fahrenheit

public class CelsiusConvert {

    public static void main(String[] args) {
        double celsiusTemp;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Please input temperature in Celsius: ");
        celsiusTemp = in.nextDouble();
        
        //Convert and output the result
        double fahrenheit = (celsiusTemp *(9.0/5.0)) + 32;
        System.out.printf("%.2f Celsius = %.2f Fahrenheit \n",
                          celsiusTemp, fahrenheit);
    }

}