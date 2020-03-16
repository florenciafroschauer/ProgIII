package tp1.ejercicio2;

public class InsertionSort {

    /**
     * a) El índice i indica la posición del elemento actual en el array a ordenar. Comienza
     * desde el segundo elemento. El elemento en el índice i se llama key. Una vez que tiene
     * la key, la segunda parte del algoritmo trata de encontrar su índice correcto. Si la
     * key es menor que el valor del elemento en el índice j, entonces la key se mueve una
     * posición hacia la izquierda. El proceso continúa hasta el caso cuando alcanzamos un
     * elemento que es más pequeño que la key.
     */

    public void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    /**
     * c)
     */

    public int insertionSortCounter(int[] array) {
        int counter = 0;
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
                counter++;
            }
            array[i + 1] = key;
        }
        return counter;
    }

    /**
     * d) Modificar los algoritmos anteriores para que ordenen cadenas.
     */

    public void insertionSort(String[] array) {
        for (int j = 1; j < array.length; j++) {
            String key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i].compareTo(key) > 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    /**
     * e) Modificar los algoritmos de manera que ordenen cualquier tipo de dato.
     */

    public void insertionSort(T[] array) {
        for (int j = 1; j < array.length; j++) {
            T key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i].compareTo(key) > 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
