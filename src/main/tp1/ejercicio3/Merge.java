package tp1.ejercicio3;

/**
 * Algoritmo de merge:
 *
 * • Mantener un índice para recorrer el arreglo a otro para b y otro para c.
 * • Recorrer linealmente los arreglos a y b, asignando de a un elemento por vez en el
 * arreglo de salida c. El elemento a asignar en c es el menor entre el elemento actual de
 * a y el actual de b.
 * • Incrementar en 1 el índice del arreglo del que provino el elemento y también
 * incrementar en 1 el índice de c.
 * • Repetir hasta que uno de los dos arreglos de entrada haya sido pasado totalmente a c.
 * • Pasar el resto del otro arreglo a c.
 */

public class Merge {

    public int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while(indexA < a.length && indexB < b.length) {

                if (a[indexA] < b[indexA]) {
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

    public void print(int[] c) {
        for (int value : c) {
            System.out.println(value);
        }
    }
}
