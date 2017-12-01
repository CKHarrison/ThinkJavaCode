public class Date {

    public static void main(String[] args) {
        String month = "December";
        String day = "Friday";
        int date = 1;
        int year = 2017;
        
//      American Format output
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
//      European Format:
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + " " + year);
       
    }

}
