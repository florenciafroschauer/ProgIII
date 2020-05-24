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

    /*  A) Generar 1000 números random que pertenezcan al intervalo [1, 100000] y guardarlos
            en un arreglo. Con ellos construir un árbol binario de búsqueda no balanceado, un
            árbol AVL y un árbol rojinegro. Para estudiar la eficiencia de cada uno:

        B) Calcular el tiempo que tarda la construcción de cada árbol.

     */

    public void createSearchTree() {
        long startTime = System.nanoTime();

        this.binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000);
    }

    public void createAvl() {
        long startTime = System.nanoTime();

        this.avlTree = new AVLTree();
        for (int i = 0; i < array.length; i++) {
            avlTree.insert(array[i]);
        }

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000);
    }

    public void createRedBlack() {
        long startTime = System.nanoTime();

        this.rbTree = new RedBlackTree();
        for (int i = 0; i < array.length; i++) {
            rbTree.insert(array[i]);
        }

        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000);
    }

     //C) Calcular la altura de cada uno:

    public int heightBST() {
        return binarySearchTree.height(binarySearchTree);
    }

    public int heightAvl() {
        return avlTree.getHeight(avlTree);
    }

    public int heightRB() {
        return rbTree.getHeight(rbTree);
    }


    /*  D) De los 1000 números elegir 10 (por ejemplo, el que ocupa la posición 0, 100, 200, etc),
            buscarlos en cada árbol y contar la cantidad de intentos que realiza el algoritmo de
            búsqueda hasta encontrarlos
    */

    public void occurencesBST(){
        for (int i = 0; i < arrayTenPositions.length; i++) {
            System.out.println("\n" + arrayTenPositions[i] + binarySearchTree.searchTries(arrayTenPositions[i]));
        }
    }

    public void occurencesAVL(){
        for (int i = 0; i < arrayTenPositions.length; i++) {
            System.out.println("\n" + arrayTenPositions[i]  + avlTree.searchTries(avlTree, arrayTenPositions[i]));
        }
    }

    public void occurencesRBT(){
        for (int i = 0; i < arrayTenPositions.length; i++) {
            System.out.println("\n" + arrayTenPositions[i]  + rbTree.searchTries(rbTree, arrayTenPositions[i]));
        }
    }





    //PRIVATE METODS:
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
            arrayTenPositions[i] = array[i*100];
        }
    }

}
