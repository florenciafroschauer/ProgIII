package tp1.ejercicio2;

public class BubbleSort<T extends Comparable> {

    /**
     * a) El algoritmo de burbujeo recorre toda una Lista o Array comparando cada uno de los
     * elementos con el elemento siguiente e intercambiandolos si es mayor. Al finalizar el
     * proceso el elemento mayor queda ubicado en la última posición, mientras que todos los
     * elementos menores han “ascendido” una posición. El proceso se continúa repitiendo
     * nuevamente desde la posición inicial del arreglo hasta que cada elemento “caiga” a su
     * posición correcta.
            */

    public void stringBubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    // swap a[j+1] and a[i]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
    }

    public int bubbleSortCounter(int[] a) {
        int counter = 0;
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    counter++;
                }
        } return counter;
    }

    /**
     * d) Modificar los algoritmos anteriores para que ordenen cadenas.
     */

    public void stringBubbleSort(String[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (a[j].compareTo(a[j+1]) > 0) {
                    // swap a[j+1] and a[i]
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
    }

    /**
     * e) Modificar los algoritmos de manera que ordenen cualquier tipo de dato.
     */

    public void genericBubbleSort(T[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (a[j].compareTo(a[j+1]) > 0) {
                    // swap a[j+1] and a[i]
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
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
