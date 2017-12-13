import java.util.Arrays;
import java.util.Random;

public class Exercise8_1 {
    public static void main(String[] args) {
        
        //Printing a string representation of an array
        //System.out.print(Array.toString(a));
//        System.out.println(Arrays.toString(powArray()));
        double[] a = {1,2,3,4};
        System.out.println(Arrays.toString(powArray(a, 3)));
        
        //creating a random array and storing it
        int[] scoreArray = randomArray(100);
        System.out.println("Printing out the number of scores for each possible number:");
        System.out.println(Arrays.toString(histogram(scoreArray)));
       
    }
    
//    for(int i = 0; i < array.legth; i++) {
//      a[i] = Math.pow(a[i], 2.0);
    
    public static double[] powArray(double[] x, int y){
        
        double[] b = new double[x.length];
        
        for(int i = 0; i < x.length; i++) {
            b[i] = Math.pow(x[i], y);
        }
        return b;
    }
    
    //Creating a random array of 100 scores
    
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for(int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
    
//    //Enhanced For Loop Exercise
//    int[] counts = new int[100];
//    for(int score: scores);
//    counts[score]++;
//    
    public static int[] histogram(int[]array) {
        // create a counter for each of the 100 possible scores
        int[] counts = new int[100];
        for(int score : array) {
            counts[score]++;
        }
        return counts;
    }
}