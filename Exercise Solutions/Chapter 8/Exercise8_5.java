//Have not finished this exercise
import java.util.Arrays;

public class Exercise8_5 {
    public static void main(String[] args) {
        //int[arr] = {1, 2, 3, 7, 8};
        System.out.println(sieve(5));
    }
    public static boolean[] sieve(int n) {
        int[] arr;
        //Building the array up to n length;
        for(int i =0; i < n; i++) {
            arr[i] = i;
        }
        //Searching for prime numbers
        for(int j = 0; j < arr.lenght; j++) {
            if(arr[j] % arr[j] == 1 && 
    }
}