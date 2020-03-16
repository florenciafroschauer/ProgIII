package tp1.ejercicio1;

/**
 * Ejercicio 1
 * Modificar los algoritmos de búsqueda secuencial y búsqueda binaria de manera que
 * devuelva la posición en donde se encuentra el valor a buscar. Tener en cuenta que
 * el elemento a buscar puede no pertenecer al conjunto.
 */

public class SearchAlgorithm {

    /**
     * Search for a number in an array, not necessarily ordered, of ints and returns the position
     * it is in or -1 if it can't find it.
     */

    public int SeqSearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (k == a[i]) return i;
        }
        return -1;
    }

    /** Search for a number in an ordered array of ints and return the position it is in or -1
     * if it can't find it.
     */

    public int BinarySearch(int[] a, int k) {
        int min = 0;
        int max = a.length - 1;
        int middle = (min + max) / 2;
        while (min <= max) {
            if (k == a[middle]) return middle;
            else if (k < a[middle]) {
                max = middle - 1;
            } else {
                min = middle + 1;
                middle = (min + max) / 2;
            }
        }
        return -1;
    }

    public void printArray(int[] a) {
        for (int i: a) {
            System.out.println(a[i]);
        }
    }
}
