package myPackage.arboles;

import tp5.BinaryTree;
import tp6.BinarySearchTree;

public class BTPracticeTester {
    public static void main(String[] args) {
        BTPractice<Integer> practice = new BTPractice<>();
        BinarySearchTree<Integer> totalAccount = new BinarySearchTree<>();
        BinarySearchTree<Integer> deleteAccount = new BinarySearchTree<>();

        totalAccount.insert(100);
        totalAccount.insert(200);
        totalAccount.insert(300);
        totalAccount.insert(400);
        totalAccount.insert(500);
        totalAccount.insert(600);

        deleteAccount.insert(200);
        deleteAccount.insert(400);
        deleteAccount.insert(500);

        System.out.println("Total accounts: \t");
        practice.printTree(totalAccount);
        System.out.println("\nTotal accounts after deleting: ");
        practice.printTree(practice.deleteAccount(totalAccount, deleteAccount));


        System.out.println("\n-------------------------------------------");
        BinarySearchTree<String> bankBranch = new BinarySearchTree<>();

        bankBranch.insert("A4");
        bankBranch.insert("A3");
        bankBranch.insert("B4");
        bankBranch.insert("B1");
        bankBranch.insert("B7");
        bankBranch.insert("A9");
        bankBranch.insert("B5");
        bankBranch.insert("A0");
        bankBranch.insert("A2");
        bankBranch.insert("A1");
        bankBranch.insert("B6");

        System.out.println("\nBank branches before separating: ");
        practice.printStringTree(bankBranch);
        practice.separateAccount(bankBranch);
        System.out.println("\nA bank branches: ");
        practice.printStringTree(practice.getBankBranchA());
        System.out.println("\nB bank branches: ");
        practice.printStringTree(practice.getBankBranchB());

        System.out.println("\n-------------------------------------------");

        BinaryTree<Integer> left3 = new BinaryTree<>(1);
        BinaryTree<Integer> right1 = new BinaryTree<>(2);
        BinaryTree<Integer> left2 = new BinaryTree<>(4, left3, right1);

        BinaryTree<Integer> left1 = new BinaryTree<>(11);
        BinaryTree<Integer> right3 = new BinaryTree<>(12);
        BinaryTree<Integer> right2 = new BinaryTree<>(13, left1, right3);

        BinaryTree<Integer> left = new BinaryTree<>(15, left2, right2);

        BinaryTree<Integer> rRight1 = new BinaryTree<>(8);
        BinaryTree<Integer> rLeft1 = new BinaryTree<>(9);
        BinaryTree<Integer> rRight = new BinaryTree<>(7, rLeft1 ,rRight1);

        BinaryTree<Integer> rRight2 = new BinaryTree<>(10);
        BinaryTree<Integer> rLeft2 = new BinaryTree<>(4);
        BinaryTree<Integer> rLeft = new BinaryTree<>(16, rLeft2, rRight2);

        BinaryTree<Integer> right = new BinaryTree<>(6, rLeft, rRight);

        BinaryTree<Integer> binaryTree = new BinaryTree<>(5, left, right);

        System.out.println("Binary Tree: ");
        practice.inorder(binaryTree);
        System.out.println("\nIsomorphic Binary Tree: ");
        practice.inorder(practice.isomorphicSumTree(binaryTree));

        System.out.println("\n-------------------------------------------");

        System.out.println("\nSearch for 1: ");
        System.out.println(practice.elementIsInLeafs(binaryTree, 1));

        System.out.println("\nSearch for 15: ");
        System.out.println(practice.elementIsInLeafs(binaryTree, 15));

        System.out.println("\nSearch for 9: ");
        System.out.println(practice.elementIsInLeafs(binaryTree, 9));

        System.out.println("\nSearch for 8: ");
        System.out.println(practice.elementIsInLeafs(binaryTree, 8));

        System.out.println("\nSearch for 5: ");
        System.out.println(practice.elementIsInLeafs(binaryTree, 5));

        System.out.println("\nSearch for 17: ");
        System.out.println(practice.elementIsInLeafs(binaryTree, 17));

        System.out.println("\n-------------------------------------------");


        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(10);
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(8);
        binarySearchTree.insert(9);
        binarySearchTree.insert(4);
        binarySearchTree.insert(12);
        binarySearchTree.insert(17);
        binarySearchTree.insert(23);
        binarySearchTree.insert(1);
        binarySearchTree.insert(7);
        binarySearchTree.insert(11);
        binarySearchTree.insert(15);

        System.out.println("\nNumber of element between 1 and 7: ");
        System.out.println(practice.keyInRange(binarySearchTree, 1, 7));

        System.out.println("\nNumber of element between 7 and 15: ");
        System.out.println(practice.keyInRange(binarySearchTree, 7, 15));

        System.out.println("\nNumber of element between 15 and 25: ");
        System.out.println(practice.keyInRange(binarySearchTree, 15, 25));
    }
}
