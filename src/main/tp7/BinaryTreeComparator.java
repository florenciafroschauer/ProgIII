package tp7;

import tp6.BinarySearchTree;
import java.util.Random;
/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class BinaryTreeComparator {
    private int[] array;
    private int[] arrayTenPositions;
    private AVLTree avlTree;
    private BinarySearchTree binarySearchTree;
    private RBTree rbTree;

    public BinaryTreeComparator() {
        fillArray();
        fillArrayTenPositions();
    }

    public void createSearchTree() {
        long startTime = System.nanoTime();

        this.binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    public void createAvl() {
        long startTime = System.nanoTime();

        this.avlTree = new AVLTree();
        for (int i = 0; i < array.length; i++) {
            avlTree.insert(new Node(array[i]), array[i]);
        }

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    public void createRedBlack() {
        long startTime = System.nanoTime();

        this.rbTree = new RBTree();
        for (int i = 0; i < array.length; i++) {
            rbTree.insert(rbTree, array[i]);
        }

        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    public int heightBST() {
        return binarySearchTree.height(binarySearchTree);
    }

    public int heightAvl() {
        return avlTree.height(avlTree.root);
    }

    public int heightRB() {
        return rbTree.height(rbTree.root);
    }

    private void fillArray() {
        int minimo = 1;
        int max = 100000;
        array = new int[1000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNum = (int) ((Math.random() * ((max - minimo) + 1)) + minimo);
            array[i] = randomNum;
        }
    }

    private void fillArrayTenPositions() {
        for (int i = 0; i < 10; i++) {
            arrayTenPositions[i] = i*100;
        }
    }
}
