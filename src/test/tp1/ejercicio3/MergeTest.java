package tp1.ejercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void mergeTest() {
        Merge merge = new Merge();

        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10,11,12};
        int[] c = {1,2,3,4,5,6,7,8,9,10,11,12};
        assertArrayEquals(c, merge.merge(a, b) );
    }
}
