public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ) {
            return -1;
        }else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if(result != -1) {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
