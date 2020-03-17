package tp1.ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void intInsertionSortTest() {
        InsertionSort insertionSort = new InsertionSort();
        int[] a = {4,7,1,3,2,6,5};
        int[] b = {1,2,3,4,5,6,7};
        insertionSort.insertionSort(a);
        assertArrayEquals(b,a);
    }

    @Test
    public void stringInsertionSortTest() {
        InsertionSort insertionSort = new InsertionSort();
        String[] a = {"Florencia", "Juan", "Agustin"};
        String[] b = {"Agustin", "Florencia", "Juan"};
        insertionSort.stringInsertionSort(a);
        assertArrayEquals(b,a);
    }

    @Test
    public void genericInsertionSortTest() {
        InsertionSort insertionSort = new InsertionSort();
        String[] a = {"b", "c", "a"};
        String[] b = {"a", "b", "c"};
        insertionSort.genericInsertionSort(a);
        assertArrayEquals(b,a);
    }
}
