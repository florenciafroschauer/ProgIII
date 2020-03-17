package tp2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BlastTest {

    @Test
    public void sequenceSimilarity() {
        Blast blast = new Blast();

        assertEquals(1, blast.sequenceSimilarity("ATCGATCG", "ATCGATCG"), 0.5);
        assertEquals(0.875, blast.sequenceSimilarity("ATCGATCG", "ACCGATCG"), 0.5);
        assertEquals(0.75, blast.sequenceSimilarity("ATCGATCG", "ACCCATCG"), 0.5);
        assertEquals(0.625, blast.sequenceSimilarity("ATCGATCG", "ACCCCTCG"), 0.5);
        assertEquals(0.5, blast.sequenceSimilarity("ATCGATCG", "ACCCCCCG"), 0.5);
        assertEquals(0.375, blast.sequenceSimilarity("ATCGATCG", "ACCCCCCC"), 0.5);
        assertEquals(0, blast.sequenceSimilarity("ATCGATCG", "GCTAGCTA"), 0.5);
    }
}
