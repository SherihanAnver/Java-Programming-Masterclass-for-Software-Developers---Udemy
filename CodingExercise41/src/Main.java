import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int count = 5;
        System.out.println("Enter " +count + " integers");
        int[] array = SortedArray.getIntegers(count);
        System.out.println(Arrays.toString(array));

//        System.out.println("original array");
//        SortedArray.printArray(array);
//        System.out.println("Desc sorted array");
//        SortedArray.printArray(SortedArray.sortIntegers(array));
    }
}
