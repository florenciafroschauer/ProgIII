package tp1.ejercicio1;


public class SearchAlgorithmTest {

    public static void main(String[] args) {
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        int key = 3;
        int[] intArray1 = {1,6,3,9,2};
        System.out.println("Binary Search: " + searchAlgorithm.BinarySearch(intArray1, key));
        System.out.println("Sequential Search: " + searchAlgorithm.SeqSearch(intArray1, key));
    }
}
