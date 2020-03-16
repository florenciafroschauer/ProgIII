package tp1.ejercicio2;

import tp1.ejercicio1.SearchAlgorithm;

/**
 * @author Agustin Augurusa
 */

public class Tester {
    public static void main(String[] args) {
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Binary search:");

        searchAlgorithm.printArray(a);
        System.out.println(searchAlgorithm.BinarySearch(a, 5));
        System.out.println(searchAlgorithm.BinarySearch(a, 6));
        System.out.println(searchAlgorithm.BinarySearch(a, 7));
        System.out.println(searchAlgorithm.BinarySearch(a, 11));

        System.out.println(searchAlgorithm.SeqSearch(a, 8));
        System.out.println(searchAlgorithm.SeqSearch(a, 9));
        System.out.println(searchAlgorithm.SeqSearch(a, 10));
        System.out.println(searchAlgorithm.SeqSearch(a, 11));

        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Int Sort:");

        int[] intArray = {2, 5, 9, 1, 5};
        System.out.println("Sorting Time: " + insertionSort.insertionSort(intArray));
        insertionSort.printIntArray(intArray);

        System.out.println("---------------");

        System.out.println("String Sort:");
        String[] stringArray = {"Juan", "Agustin", "Florencia"};
        insertionSort.insertionSort(stringArray);
        insertionSort.printArray(stringArray);

        System.out.println("---------------");

        String[] genericArray = {"a", "d", "b", "g", "c", "e", "f"};
        System.out.println("generic");
        insertionSort.insertionSortGeneric(genericArray);
        insertionSort.printArray(genericArray);
    }
}
