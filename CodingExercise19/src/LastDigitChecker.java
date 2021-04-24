public class LastDigitChecker {
    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        boolean result = false;

        if(isValid(num1) && isValid(num2) && isValid(num3)){
            String stringOfNum1 = String.valueOf(Math.abs(num1));
            String stringOfNum2 = String.valueOf(Math.abs(num2));
            String stringOfNum3 = String.valueOf(Math.abs(num3));

            if((stringOfNum1.charAt(stringOfNum1.length()-1) == stringOfNum2.charAt(stringOfNum2.length()-1)) ||
                    (stringOfNum2.charAt(stringOfNum2.length()-1) == stringOfNum3.charAt(stringOfNum3.length()-1))||
                    (stringOfNum3.charAt(stringOfNum3.length()-1) == stringOfNum1.charAt(stringOfNum1.length()-1))){
                result = true;
            }
        }
        return result;
    }
}
