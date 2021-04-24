import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[count];

        for(int i=0 ; i<count ; i++){
            intArray[i] = scanner.nextInt();
        }
        return  intArray;
    }

    private static int findMin(int[] intArray){
        int min = intArray[0];

        for(int i=1;i<intArray.length;i++){
            if(min > intArray[i]){
                min = intArray[i];
            }
        }
        return min;
    }
}
