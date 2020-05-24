package tp7;

import tp6.BinarySearchTree;

import java.util.Random;

/**
 * @author Agustin Augurusa
 */
public class BinaryTreeComparator {

    int[] array;
    int[] arrayTenPositions;
    AVLTree avlTree;
    BinarySearchTree binarySearchTree;
    RBTree rbTree;

    public BinaryTreeComparator(){
        fillArray();
        fillArrayTenPositions();
    }

    public int heightAvl(){
        return avlTree.height(avlTree.getRoot());
    }

    public void heightRB(){

    }


    public int heightBST(){
        return binarySearchTree.height(binarySearchTree);
    }

    private void createAvl(){
        long startTime = System.nanoTime();
        this.avlTree = new AVLTree();
        for (int i = 0; i < array.length; i++) {
            avlTree.insert(array[i]);
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    private void createRedBlack(){
        long startTime = System.nanoTime();
        this.rbTree = new RBTree(Integer.MIN_VALUE);
        for (int i = 0; i < array.length; i++) {
            rbTree.insert(array[i]);
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    private void createSearchTree(){
        long startTime = System.nanoTime();
        this.binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }

    private void fillArray(){
        int minimo = 1;
        int max = 100000;
        array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNum = (int) ((Math.random() * ((max - minimo) + 1)) + minimo);
            array[i] = randomNum;
        }
    }

    private void fillArrayTenPositions(){
        for (int i = 0; i < 10; i++) {
            arrayTenPositions[i] = i*100;
        }
    }
}
