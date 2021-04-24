public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int firstNumber = 0;
        int lastNumber = 0;

        if(number < 0){
            sum = -1;
        }else{
            int lengthOfNumber = String.valueOf(number).length();
            if(lengthOfNumber == 1){
                sum = number + number;
            }else {
                for (int i = 0; i < lengthOfNumber; i++) {
                    if (i == 0) {
                        firstNumber = Character.getNumericValue(String.valueOf(number).charAt(i));
                        sum += firstNumber;
                        continue;
                    }
                    if (i == lengthOfNumber - 1) {
                        lastNumber = Character.getNumericValue(String.valueOf(number).charAt(i));
                        sum += lastNumber;
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
