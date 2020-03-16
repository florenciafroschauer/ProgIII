package tp1.ejercicio3;

import tp1.ejercicio1.SearchAlgorithm;

public class Tester {
    public static void main(String[] args) {

        int[] intArray = {1,3,5};
        int[] intArray2 = {2,4,6};

        int[] mergeArray = Merge.merge(intArray,intArray2);

        Merge.print(mergeArray);

    }
}
