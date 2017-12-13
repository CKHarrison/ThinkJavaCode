import java.util.Random;
import java.util.Arrays;

public class Exercise8_4 {
    public static void main(String[] args) {
        int[] arr = randomArray(10);
        System.out.print("The array we are using is: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("The index of the highest element is: ");
        System.out.println(indexOfMax(arr));
    }
    
    //Create Random Array
    public static int[] randomArray(int size){
        Random random = new Random();
        int array[] = new int[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    
    
    //Search Array for highest element at index
    public static int indexOfMax(int[] arr) {
        int temp = arr[0];
        int tempIndex = 0;
        //Find the highest element in the array
        //Assign the index to tempIndex
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > temp) {
                temp = arr[i];
                tempIndex = i;
            }
        }
        return tempIndex;
    }
}