package tp1.ejercicio3;

import java.util.ArrayList;

public class MergeGeneric<T extends Comparable>{


    public T[] merge(T[] a, T[] b) {
        T[] c = (T[]) new ArrayList[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while(indexA < a.length && indexB < b.length) {

            if (a[indexA].compareTo(b[indexB]) < 0) {
                c[indexC] = a[indexA];
                indexA++;
            } else {
                c[indexC] = b[indexB];
                indexB++;
            }
            indexC++;
        }


        while(indexA < a.length) {
            c[indexC] = a[indexA];
            indexA++;
            indexC++;
        }

        while(indexB < b.length) {
            c[indexC] = b[indexB];
            indexB++;
            indexC++;
        }

        return c;
    }

    public static void print(int[] c) {
        for (int value : c) {
            System.out.println(value);
        }
    }

}
