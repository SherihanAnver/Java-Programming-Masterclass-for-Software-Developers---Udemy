public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        boolean result = false;

        if(num1 >= 10 && num1 <= 99 && num2 >=10 && num2 <= 99){
            String num1String = String.valueOf(Math.abs(num1));
            String num2String = String.valueOf(Math.abs(num2));

            for(int i=0; i < num1String.length() ; i++){
                for(int j=0 ; j < num2String.length() ; j++){
                    if(num1String.charAt(i) == num2String.charAt(j)){
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
