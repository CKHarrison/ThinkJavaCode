public class Exercise8_6 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9};
        System.out.println(areaFactors(4, arr));
    }
    
    public static boolean areaFactors(int n, int[] array) {
        boolean flag = true;
        for(int i = 0; i < array.length; i++){
            if(array[i] % n != 0) {
                flag = false;
            } 
        }
        return flag;
    }
}