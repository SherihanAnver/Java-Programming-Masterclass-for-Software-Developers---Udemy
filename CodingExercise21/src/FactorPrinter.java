public class FactorPrinter {
    public static void printFactors(int number){
        String resultString = "";

        if(number < 1){
            resultString = "Invalid Value";
        }else{
            for(int i=1 ; i<=number; i++){
                if(number % i == 0){
                    resultString = resultString + i + " ";
                }
            }
        }
        System.out.println(resultString);
    }
}
