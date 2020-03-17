package tp1.ejercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = {5,4,3,2,1};
        int[] b = {1,2,3,4,5};
        bubbleSort.bubbleSort(a);

        bubbleSort.printIntArray(a);
        assertArrayEquals(b, a);
    }

    @Test
    public void stringBubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        String[] a = {"d", "c","b","a"};
        String[] b = {"a","b","c","d"};
        bubbleSort.stringBubbleSort(a);

        bubbleSort.printArray(a);
        assertArrayEquals(b, a);
    }

    @Test
    public void genericBubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        String[] a = {"d", "c","b","a"};
        String[] b = {"a","b","c","d"};
        bubbleSort.genericBubbleSort(a);

        bubbleSort.printArray(a);
        assertArrayEquals(b, a);
    }
}
