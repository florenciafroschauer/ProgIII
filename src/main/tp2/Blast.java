package tp2;

public class Blast {
    public double sequenceSimilarity(String referenceSequence, String querySequence) {
        double sequenceLength = referenceSequence.length();
        double similarity = 0;

        for (int i = 0; i < sequenceLength; i++) {
            if (referenceSequence.charAt(i) == querySequence.charAt(i)) {
                similarity ++;
            }
        }

        return similarity / sequenceLength;
    }
}
