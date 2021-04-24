public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2){
        boolean result = false;
        int num1 = (int)number1;
        int num2 = (int)number2;

        double roundedNum1 = (double)((long)(number1*1000))/1000;
        double roundedNum2 = (double)((long)(number2*1000))/1000;

        if(num1 == 0 || num2 == 0) {
            if(number1 == number2){
                result = true;
            }
        }else{
            if(num1 == num2) {
                if (roundedNum1 % num1 == roundedNum2 % num2) {
                    result = true;
                }
            }
        }
        return result;
    }
}
