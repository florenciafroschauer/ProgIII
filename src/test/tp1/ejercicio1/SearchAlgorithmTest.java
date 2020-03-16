package tp1.ejercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SearchAlgorithmTest {

    @Test
    public void seqSearchTest() {
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        int[] a = {1,2,3,4,5,6,7,8,9,10, -1, -1};

        assertEquals(0, searchAlgorithm.SeqSearch(a, 1));
        assertEquals(1, searchAlgorithm.SeqSearch(a, 2));
        assertEquals(2, searchAlgorithm.SeqSearch(a, 3));
        assertEquals(3, searchAlgorithm.SeqSearch(a, 4));
        assertEquals(-1, searchAlgorithm.SeqSearch(a, 11));
        assertEquals(10, searchAlgorithm.SeqSearch(a, -1));
    }

    @Test
    public void binarySearchTest() {
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(0, searchAlgorithm.binarySearch(a,1));
        assertEquals(1, searchAlgorithm.binarySearch(a,2));
        assertEquals(2, searchAlgorithm.binarySearch(a,3));
        assertEquals(3, searchAlgorithm.binarySearch(a,4));
        assertEquals(-1, searchAlgorithm.binarySearch(a,11));
    }
}
