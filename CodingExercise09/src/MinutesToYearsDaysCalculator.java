public class MinutesToYearsDaysCalculator {
    public static final String INVALID_VALUE = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        int years = (int)(minutes / (60 * 24  * 365));
        long days = (minutes % (60*24*365)) / (60*24);

        if(minutes < 0 ){
            System.out.println(INVALID_VALUE);
        }else{
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
