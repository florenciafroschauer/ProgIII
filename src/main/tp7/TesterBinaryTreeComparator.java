package tp7;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class TesterBinaryTreeComparator {
    public static void main(String[] args) {
        BinaryTreeComparator binaryTreeComparator = new BinaryTreeComparator();

        System.out.println("\nCreation Time AVL: ");
        binaryTreeComparator.createAvl();
        System.out.println("\nCreation Time RBT: ");
        binaryTreeComparator.createRedBlack();
        System.out.println("\nCreation Time BST: ");
        binaryTreeComparator.createSearchTree();

        System.out.println("\n**********************************************");

        System.out.println("\nHeight AVL: " + binaryTreeComparator.heightAvl());
        System.out.println("\nHeight RBT: " + binaryTreeComparator.heightRB());
        System.out.println("\nHeight BST: " + binaryTreeComparator.heightBST());

        System.out.println("\n**********************************************");

        binaryTreeComparator.searchTriesAVL();
        binaryTreeComparator.searchTriesRBT();
        binaryTreeComparator.searchTriesBST();

        System.out.println("\n**********************************************");

        double[] mean = binaryTreeComparator.searchTriesPlus();
        System.out.println("\nBS Tree mean: " + mean[0]);
        System.out.println("\nAVL Tree mean: " + mean[1]);
        System.out.println("\nRB Tree mean: " + mean[2]);
    }
}
