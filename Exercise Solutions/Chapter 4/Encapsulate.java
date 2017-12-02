public class Encapsulate {

    public static void printAmerican(String day, String month,  int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    
    }
    
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }
    
    public static void main(String[] args) {
        String month = "December";
        String day = "Friday";
        int date = 1;
        int year = 2017;
        printAmerican(day, month, date, year);
        printEuropean(day, date, month, year);
        
        
////      American Format output
//        System.out.println("American Format:");
//        System.out.println(day + ", " + month + " " + date + ", " + year);
////      European Format:
//        System.out.println("European Format:");
//        System.out.println(day + " " + date + " " + month + " " + year);
       
    }

}
