package spoj.spojTest;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import spoj.MergeSort;

public class MergeSortTest {
    @Test
    public void mergeSort() {
        int[] arr = {1,4,6,2,5,3};
        int [] aux = new int[6];
        MergeSort M = new MergeSort();
        M.sort(arr, aux, 0, 5);
        int i;
        for(i=0;i<6;i++) {
            aux[i] = i+1;
        }
        for(i=0;i<6;i++) {
            System.out.print(arr[i] + "  ");
        }
        assertArrayEquals(aux, arr);
//
    }
}
