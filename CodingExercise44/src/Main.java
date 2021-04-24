import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myPrimitiveIntArray =  {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>(10);

        for(int i=0;i<10;i++){
            myIntArrayList.add(myPrimitiveIntArray[i]) ;
        }
        System.out.println(myIntArrayList);

        String strValue = "234";
        Integer intValue = Integer.valueOf(strValue,8);

        System.out.println(intValue);
    }
}
