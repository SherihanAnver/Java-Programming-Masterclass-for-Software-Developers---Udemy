import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[count];

        for(int i=0 ; i<count ; i++){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }Co

    public static void printArray(int[] intArray){
        for (int i=0 ; i< intArray.length ; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray){
        Arrays.sort(intArray);
        int[] sortedArray = new int[intArray.length];
        int currentIndex = 0;

        for(int i = intArray.length - 1 ; i>=0 ; i--){
            sortedArray[currentIndex ++] = intArray[i];
        }

        return sortedArray;
    }
}

