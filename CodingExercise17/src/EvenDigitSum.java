public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sumOfEvenDigits = 0;

        if(number < 0){
            sumOfEvenDigits = -1;
        }else{
            int lengthOfNumber = String.valueOf(number).length();

            for(int i=0 ; i< lengthOfNumber ; i++){
                int currentNumber = Character.getNumericValue(String.valueOf(number).charAt(i));
                if(currentNumber % 2 == 0){
                    sumOfEvenDigits += currentNumber;
                }else{
                    continue;
                }
            }
        }
        return sumOfEvenDigits;
    }
}
