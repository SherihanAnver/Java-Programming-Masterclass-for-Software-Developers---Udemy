public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        boolean result = false;

        if((num1 >=13 && num1 <=19) || (num2 >=13 && num2 <=19) || (num3 >=13 && num3 <=19)){
            result = true ;
        }
        return result;
    }
    public static boolean isTeen (int num){
        boolean result = false;

        if(num >=13 && num <= 19){
            result = true;
        }
        return result;
    }
}
