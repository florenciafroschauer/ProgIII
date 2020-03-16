package tp1.ejercicio2;

/**
 * @author Agustin Augurusa
 */
public class InsertionSortTester {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Int Sort:");

        int[] intArray = {2,5,9,1,5};
        System.out.println("Sorting Time: " + insertionSort.insertionSort(intArray));
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("---------------");

        System.out.println("String Sort:");
        String[]stringArray = {"Juan", "Agustin", "Florencia"};
        insertionSort.insertionSort(stringArray);
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
