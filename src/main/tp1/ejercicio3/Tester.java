package tp1.ejercicio3;

import tp1.ejercicio1.SearchAlgorithm;

public class Tester {
    public static void main(String[] args) {

        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(searchAlgorithm.BinarySearch(a, 4));
        System.out.println(searchAlgorithm.SeqSearch(a, 4));

    }
}
