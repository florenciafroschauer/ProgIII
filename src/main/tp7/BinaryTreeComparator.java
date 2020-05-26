package tp7;

import tp6.BinarySearchTree;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class BinaryTreeComparator {
    private Integer[] array;
    private Integer[] arrayTenPositions;
    private AVLTree avlTree;
    private BinarySearchTree binarySearchTree;
    private RedBlackTree rbTree;

    public BinaryTreeComparator() {
        fillArray();
        fillArrayTenPositions();
    }

    /**  A) Generar 1000 números random que pertenezcan al intervalo [1, 100000] y guardarlos
            en un arreglo. Con ellos construir un árbol binario de búsqueda no balanceado, un
            árbol AVL y un árbol rojinegro. Para estudiar la eficiencia de cada uno:

        B) Calcular el tiempo que tarda la construcción de cada árbol.

     */

    public void createSearchTree() {
        long startTime = System.nanoTime();

        this.binarySearchTree = new BinarySearchTree();
        for (Integer integer : array) {
            binarySearchTree.insert(integer);
        }

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000);
    }

    public void createAvl() {
        long startTime = System.nanoTime();

        this.avlTree = new AVLTree();
        for (Integer integer : array) {
            avlTree.insert(integer);
        }

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000);
    }

    public void createRedBlack() {
        long startTime = System.nanoTime();

        this.rbTree = new RedBlackTree();
        for (Integer integer : array) {
            rbTree.insert(integer);
        }

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000);
    }

    /**
     * C) Calcular la altura de cada uno:
     */

    public int heightBST() {
        return binarySearchTree.height(binarySearchTree);
    }

    public int heightAvl() {
        return avlTree.getHeight(avlTree);
    }

    public int heightRB() {
        return rbTree.getHeight(rbTree);
    }

    /**  D) De los 1000 números elegir 10 (por ejemplo, el que ocupa la posición 0, 100, 200, etc),
            buscarlos en cada árbol y contar la cantidad de intentos que realiza el algoritmo de
            búsqueda hasta encontrarlos
    */

    public void searchTriesBST() {
        for (Integer arrayTenPosition : arrayTenPositions) {
            System.out.println("\nBS Tree Tries with nº " + arrayTenPosition + " :\n" +
                    binarySearchTree.searchTries(arrayTenPosition));
        }

        System.out.println("\nBST Mean: " + (double)searchTriesBSTAux()/10);
    }

    public void searchTriesAVL() {
        for (Integer arrayTenPosition : arrayTenPositions) {
            System.out.println("\nAVL Tree Tries with nº " + arrayTenPosition + " :\n" +
                    avlTree.searchTries(arrayTenPosition));
        }

        System.out.println("\nAVL Mean: " + (double)searchTriesAVLAux()/10);
    }

    public void searchTriesRBT() {
        for (Integer arrayTenPosition : arrayTenPositions) {
            System.out.println("\nRB Tree Tries with nº " + arrayTenPosition + " :\n" +
                    rbTree.searchTries(arrayTenPosition));
        }

        System.out.println("\nRBT Mean: " + (double)searchTriesRBTAux()/10);

    }

    public double[] searchTriesPlus() {
        double meanBST = 0;
        double meanAVL = 0;
        double meanRBT = 0;
        for (int i = 0; i < 10; i++) {
            fillArrayTenPositions();
            meanBST += searchTriesBSTAux();
            meanAVL += searchTriesAVLAux();
            meanRBT += searchTriesRBTAux();
        }
        double[] mean = {meanBST/100, meanAVL/100, meanRBT/100};
        return mean;
    }

    //Private methods
    private static final Random gen = new Random();
    private Integer[] fillArray() {

        array = new Integer[1000];
        Set<Integer> used = new HashSet<Integer>();

        for (int i = 0; i < 1000; i++) {

            int newRandom;
            do {
                newRandom = gen.nextInt(100001);
            } while (used.contains(newRandom));
                array[i] = newRandom;
                used.add(newRandom);
            }
            return array;
        }

    private void fillArrayTenPositions() {
        arrayTenPositions = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arrayTenPositions[i] = array[(int)(Math.random() * ((1000 - 1)) + 1)];
        }
    }

    private int searchTriesBSTAux() {
        int tries = 0;
        for (Integer arrayTenPosition : arrayTenPositions) {
            tries += binarySearchTree.searchTries(arrayTenPosition);
        }
        return tries;
    }

    private int searchTriesAVLAux() {
        int tries = 0;
        for (Integer arrayTenPosition : arrayTenPositions) {
            tries += avlTree.searchTries(arrayTenPosition);
        }
        return tries;
    }

    private int searchTriesRBTAux() {
        int tries = 0;
        for (Integer arrayTenPosition : arrayTenPositions) {
            tries += rbTree.searchTries(arrayTenPosition);
        }
        return tries;
    }
}
