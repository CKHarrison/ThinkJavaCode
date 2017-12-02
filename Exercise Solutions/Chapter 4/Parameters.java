public class Parameters {

    public static void zool(int number, String petName, String street) {
        System.out.println("Your number: " + number);
        System.out.println("Your first pet: " + petName);
        System.out.println("The street: " + street);
    }

    public static void main(String[] args) {
        int value = 11;
        String firstPet = "Chris the chicken";
        String street = "Avalanche road";
        zool(value, firstPet, street);
    }

}

