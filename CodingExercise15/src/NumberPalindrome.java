public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        boolean result = false;
        number = Math.abs(number);
        int reversedNumber = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());

        if(number == reversedNumber){
            result = true;
        }
        return result;
    }
}
