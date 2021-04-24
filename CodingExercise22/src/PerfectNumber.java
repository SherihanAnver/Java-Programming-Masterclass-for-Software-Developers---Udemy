public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        boolean result = false;

        if(number >= 1){
            int sumOfDivisibles = 0;
            for(int i=1 ; i<number ; i++){
                if(number % i == 0){
                    sumOfDivisibles += i;
                }
            }
            if(number == sumOfDivisibles){
                result = true;
            }
        }
        return result;
    }
}
