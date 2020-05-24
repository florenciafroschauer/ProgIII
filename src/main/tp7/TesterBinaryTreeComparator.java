package tp7;

import tp6.BinarySearchTree;

/**
 * @author Agustin Augurusa
 */
public class TesterBinaryTreeComparator {
    public static void main(String[] args) {
        BinaryTreeComparator binaryTreeComparator = new BinaryTreeComparator();
        int condition = 0;

        System.out.println("Creation Time AVL: ");
        binaryTreeComparator.createAvl();
        System.out.println("Creation Time RBT: ");
        binaryTreeComparator.createRedBlack();
        System.out.println("Creation Time BST: ");
        binaryTreeComparator.createSearchTree();

        System.out.println("Height AVL: " + binaryTreeComparator.heightAvl());
        System.out.println("Height RBT: " + binaryTreeComparator.heightRB());
        System.out.println("Height BST: " + binaryTreeComparator.heightBST());


        binaryTreeComparator.occurencesAVL();

        binaryTreeComparator.occurencesRBT();

        binaryTreeComparator.occurencesBST();


       /* for (int i = 0; i < 10; i++) {
            System.out.println("---------------");
            binaryTreeComparator.createAvl();
            binaryTreeComparator.createSearchTree();
            binaryTreeComparator.createRedBlack();
            System.out.println("---------");

            System.out.println("Height AVL: " + binaryTreeComparator.heightAvl());
            System.out.println("Height RBT: " + binaryTreeComparator.heightRB());
            System.out.println("Height BST: " + binaryTreeComparator.heightBST());


        }*/

    }
}
