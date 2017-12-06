public class BottlesOfBeer {
    public static void beerBottles(int num) {
        if(num == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' cant take one down, ya can't pass it around,");
            System.out.println("'cause thre are no more bottles of beer on the wall!");
        } else {
            System.out.println(num + " bottles of beer on the wall,");
            System.out.println(num + " bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.println(num + " bottles of beer on the wall.");
            beerBottles(num -1);
        }
    }
    public static void main(String[] args) {
        beerBottles(99);
    }
}