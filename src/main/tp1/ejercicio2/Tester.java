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

        System.out.println("---------------");

        System.out.println("InsertionSort:");
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Int Sort:");
        int[] intArray = {2, 5, 9, 1, 5};
        System.out.println("Sorting Time: " + insertionSort.insertionSort(intArray));
        insertionSort.printIntArray(intArray);

        System.out.println("String Sort:");
        String[] stringArray = {"Juan", "Agustin", "Florencia"};
        insertionSort.insertionSort(stringArray);
        insertionSort.printArray(stringArray);

        System.out.println("Generic Sort:");
        String[] genericArray = {"a", "d", "b", "g", "c", "e", "f"};
        insertionSort.insertionSortGeneric(genericArray);
        insertionSort.printArray(genericArray);

        System.out.println("---------------");

        System.out.println("BubbleSort:");
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Int Sort: ");
        int[]intArray2 = {2, 5, 9, 1, 5};
        bubbleSort.bubbleSort(intArray2);
        bubbleSort.printIntArray(intArray2);

        System.out.println("String Sort: ");
        String[] stringArray2 = {"Juan", "Agustin", "Florencia"};
        bubbleSort.bubbleSort(stringArray2);
        bubbleSort.printArray(stringArray2);

        System.out.println("Generics Sort: ");
        String[] genericArray2 = {"a", "d", "b", "g", "c", "e", "f"};
        bubbleSort.genericBubbleSort(genericArray2);
        bubbleSort.printArray(genericArray2);

        System.out.println("---------------");

        System.out.println("Selection Sort: ");
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("Int Sort: ");
        int[]intArray3 = {2, 5, 9, 1, 5};
        selectionSort.selectionSort(intArray3);
        selectionSort.printIntArray(intArray2);

        System.out.println("String Sort: ");
        String[] stringArray3 = {"Juan", "Agustin", "Florencia"};
        selectionSort.selectionSort(stringArray3);
        selectionSort.printArray(stringArray3);

        System.out.println("Generics Sort: ");
        String[] genericArray3 = {"a", "d", "b", "g", "c", "e", "f"};
        selectionSort.selectionSort(genericArray3);
        selectionSort.printArray(genericArray3);
    }
}
