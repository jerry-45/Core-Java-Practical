import java.util.Arrays;
import java.util.Collections; 

public class SortData{
    void asec(){
        // sample int[] array
        Integer[] intArray = {1975, 2003, 1979, 1992, 1983, 1999, 1987};
        // before sorting
        System.out.println("Integer[] Array - before sorting : ");
        for(Integer iValue : intArray){
            System.out.println(iValue);
        }
        // sorting int[] array in ascending order
        Arrays.sort(intArray);
        // after sorting
        System.out.println("\nInteger[] Array - after sorting in ascending order : ");
        for(Integer iValue : intArray) {
            System.out.println(iValue);
        }
    }

    void desc(){
        // sample int[] array
        Integer[] intArray = {1975, 2003, 1979, 1992, 1983, 1999, 1987};
        // before sorting
        System.out.println("Integer[] Array - before sorting : ");
        for(Integer iValue : intArray) {
            System.out.println(iValue);
        }
        // sorting int[] array in descending order
        Arrays.sort(intArray, Collections.reverseOrder());
        // after sorting
        System.out.println("\nInteger[] Array - after sorting in descending order : ");
        for(Integer iValue : intArray) {
            System.out.println(iValue);
        }
    }
    public static void main(String[] args) {
        SortData ai=new SortData();
        SortData a2=new SortData();
        ai.asec();
        a2.desc();
    }
}