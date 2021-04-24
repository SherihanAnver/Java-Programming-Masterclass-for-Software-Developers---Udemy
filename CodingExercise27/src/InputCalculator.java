import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;

        while(true){
            if(scanner.hasNextInt()){
                int currentNumber = scanner.nextInt();
                sum += currentNumber;
                count ++;
            }else{
                break;
            }
            scanner.nextLine();
        }

        if(count == 0){
            count = 1;
        }
        avg = (int)Math.round((double)sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
