public class NumberToWords {
    public static void numberToWords(int number){
        String resultString = "";
        if(number < 0){
            resultString = "Invalid Value";
        }else{
            String numberString = String.valueOf(number);

            for(int i=0; i<numberString.length(); i++){
                int currentNumber = Character.getNumericValue
                        (numberString.charAt(i));

                resultString = resultString +
                        getNameOfNumber(currentNumber) + " ";
            }
        }
        System.out.println(resultString);
    }

    public static String getNameOfNumber(int num){
        String numberName = "";
        switch (num){
            case 0 :
                numberName = "Zero";
                break;
            case 1:
                numberName = "One";
                break;
            case 2:
                numberName = "Two";
                break;
            case 3:
                numberName = "Three";
                break;
            case 4:
                numberName = "Four";
                break;
            case 5:
                numberName = "Five";
                break;
            case 6:
                numberName = "Six";
                break;
            case 7:
                numberName = "Seven";
                break;
            case 8:
                numberName = "Eight";
                break;
            case 9:
                numberName = "Nine";
                break;
            default:
                numberName = "Invalid";
                break;
        }
        return numberName;
    }
/*
    public static int reverse(int number){
        boolean isNegative = false;
        if(number < 0){
            isNegative = true;
        }
        String reverseNumberString = new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString();

        if(isNegative){
            reverseNumberString = "-" + reverseNumberString;
        }

        return Integer.parseInt(reverseNumberString);
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }else {
            return String.valueOf(Math.abs(number)).length();
        }
    }*/
}
