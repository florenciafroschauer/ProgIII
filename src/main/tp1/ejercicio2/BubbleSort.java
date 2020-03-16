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

    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[i]) {
                    int t = a[j - 1];
                    a[j -1] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public int bubbleSortCounter(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[i]) {
                    int t = a[j - 1];
                    a[j -1] = a[j];
                    a[j] = t;
                    counter++;
                }
            }
        } return counter;
    }

    /**
     * d) Modificar los algoritmos anteriores para que ordenen cadenas.
     */

    public void bubbleSort(String[] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    String t = a[j - 1];
                    a[j -1] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    /**
     * e) Modificar los algoritmos de manera que ordenen cualquier tipo de dato.
     */

    public void bubbleSort(T[] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    T t = a[j - 1];
                    a[j -1] = a[j];
                    a[j] = t;
                }
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
