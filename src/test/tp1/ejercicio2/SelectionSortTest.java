package tp1.ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void intSelectionSortTest(){
        SelectionSort selectionSort = new SelectionSort();

        int[] a = {5,8,2,4,0,1};
        int[] b = {0,1,2,4,5,8};
        selectionSort.selectionSort(a);
        assertArrayEquals(b,a);
    }

    @Test
    public void stringSelectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();

        String[] a = {"Florencia", "Juan", "Agustin"};
        String[] b = {"Agustin", "Florencia", "Juan"};
        selectionSort.stringSelectionSort(a);
        assertArrayEquals(b,a);
    }

    @Test
    public void genericSelectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();

        String[] a = {"b", "c", "a"};
        String[] b = {"a", "b", "c"};
        selectionSort.genericSelectionSort(a);
        assertArrayEquals(b,a);
    }

    @Test
    public void recursiveSelectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();

        int[] a = {5,8,2,4,0,1};
        int[] b = {0,1,2,4,5,8};
        selectionSort.recursiveSelectionSort(a);
        assertArrayEquals(b,a);
    }
}
