package Excercise;

public class Exercise {

    /**
     * Dado	 tres	 números,	 indicar	 cuál	 es	 el	 menor.	 Ingresar	 los
     * tres	números	por	teclado.
     */

    public int min(int a, int b, int c) {
       int[] array = {a, b, c};

        for (int i: array) {
            if (array[i] < array[1+i]) {
                if (array[i] < array[i+2]) return array[i];
            }
        } return a;
    }
}
