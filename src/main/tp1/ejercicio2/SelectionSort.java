package tp1.ejercicio2;

public class SelectionSort<T extends Comparable> {

    /**
     * El algoritmo de selección ordena un array encontrando reiteradamente el mínimo
     * elemento (considerando un orden ascendente) y poniéndolo al comienzo. El algoritmo
     * mantiene dos subarrays en un determinado array:
     * - El subarray ordenado
     * - El subarray desordenado
     * En cada iteración, el mínimo elemento del array desordenado es movido al array ordenado.
     */

    public void stringSelectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public int selectionSortCounter(int[] array){
        int counter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                counter++;
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return counter;
    }

    /**
     * Modificar los algoritmos anteriores para que ordenen cadenas.
     */

    public void stringSelectionSort(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 0){
                    minIndex = j;
                }
            }
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Modificar los algoritmos de manera que ordenen cualquier tipo de dato.
     */

    public void genericSelectionSort(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Desarrollar la versión recursiva del método de selección.
     */

    public void sortRecu(int[] list){
        sort(list, 0, list.length -1);
    }

    private static void sort(int[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            int min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list, low + 1, high);

        }
    }

    public void printIntArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public void printArray(Object[] array) {
        for (Object o: array) {
            System.out.println();
        }
    }
}
