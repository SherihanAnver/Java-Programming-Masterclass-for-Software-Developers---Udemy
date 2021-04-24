public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int greatestCommonDivisor = -1;

        if(first >= 10 && second >= 10){
            int smallerNumber = first < second ? first : second;

            for(int i = smallerNumber ; i >= 1 ; i--){
                if( (first % i == 0) && (second % i == 0)){
                    greatestCommonDivisor = i;
                    break;
                }else{
                    continue;
                }
            }
        }
        return greatestCommonDivisor;
    }
}
