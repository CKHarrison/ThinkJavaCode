public class Exercise8_7 {
    //Find out if the numbers in the array are prime
    public static boolean isPrime(int[] arr) {
        //looping through the numbers in the array
        boolean isPrimeNumber = true;
        for(int i =0; i < arr.length; i++) {
            //Testing to see if the numbers are prime
            for(int j = 2; j < i; j++) {
                if(arr[i] % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        return isPrimeNumber;
    }
    // Find the product of the numbers in an array
    public static int product(int[] arr) {
        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        //System.out.println(product);
        return product;
    }
    //Check to see if the product of the array matches n and the array is composed of primes numbers
    public static boolean arePrimeFactors(int n, int[] arr) {
        boolean flag = false;
        if(product(arr) == n && isPrime(arr) == true) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 11};
        System.out.println(arePrimeFactors(770, arr));
        //product(arr);
        //System.out.println(isPrime(arr));
    }
}