public class SumOddRange {
    public static boolean isOdd(int number){
        boolean result = false;

        if(number > 0 && (number % 2 == 1)){
            result = true;
        }
        return result;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > 0 && end > 0 && end >= start) {
            for (int i = start; i < end + 1; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }else{
            sum = -1;
        }
        return sum;
    }
}
