package tp2;

/**
 * El programa que usted debe realizar tendrá que recibir dos parámetros:
 * • secuencia de referencia.
 * • secuencia query.
 * El output del programa es un porcentaje que refleja cuán parecidas son las dos
 * secuencias.
 */

public class Blast {
    public double sequenceSimilarity(String referenceSequence, String querySequence) {
        double sequenceLength = referenceSequence.length();
        double similarity = 0;

        for (int i = 0; i < sequenceLength; i++) {
            if (referenceSequence.charAt(i) == querySequence.charAt(i)) {
                similarity++;
            }
        }

        return similarity / sequenceLength;
    }
}
