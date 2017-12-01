public class Time {

    public static void main(String[] args) {
        int hour = 15;
        int minute = 46;
        int second = 41;
        int secondsSinceMidnight = ((hour * 60) *60) + (minute * 60) + second;
        int midnight = (24 * 60) * 60;
        double midnightDouble = (24.0 * 60.0) * 60;
        int oldTime = 55820;
        
        System.out.println("Number of seconds since Midnight: ");
        System.out.println(secondsSinceMidnight);
        System.out.println("Number of seconds until Midnight: ");
        System.out.println(midnight - secondsSinceMidnight);
        System.out.println("Percentage of day that has passed:");
        System.out.println( (secondsSinceMidnight / midnightDouble) * 100 + "%");
        System.out.println("Time elapsed since the start of this project");
        System.out.println(secondsSinceMidnight - oldTime);
        
    }
}
