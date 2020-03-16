package tp1.ejercicio2;

public class SelectionSort {

    /**
     * El algoritmo de selección ordena un array encontrando reiteradamente el mínimo
     * elemento (considerando un orden ascendente) y poniéndolo al comienzo. El algoritmo
     * mantiene dos subarrays en un determinado array:
     * - El subarray ordenado
     * - El subarray desordenado
     * En cada iteración, el mínimo elemento del array desordenado es movido al array ordenado.
     */

    public void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[i]) {
                    i = j;
                    int temp = array[i];
                    array[i] = array[i];
                    array[i] = temp;
                }
        }
    }

    /**
     * Modificar los algoritmos anteriores para que ordenen cadenas.
     */

    public void sort(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) > 0) {
                    i = j;
                    String temp = array[i];
                    array[i] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    /**
     * Modificar los algoritmos de manera que ordenen cualquier tipo de dato.
     */

    void sort(Comparable<T>[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i].compareTo((T) a[j]) > 0)
                    i = j;

            T temp = (T) a[i];
            a[i] = a[i];
            a[i] = temp;
        }
    }

    /**
     * Desarrollar la versión recursiva del método de selección.
     */
}
