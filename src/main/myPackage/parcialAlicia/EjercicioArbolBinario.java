package myPackage.parcialAlicia;

import tp5.BinaryTree;

/**
 * @author florenciafroschaer
 */
/**
 * Usando solamente las primitivas de BinaryTree desarrollar y probar un método que recibe un árbol binario
 * de números enteros y devuelve un árbol isomorfo en el cual cada nodo contiene la suma de él junto con todos
 * sus descendientes siempre que sean impares.
 */
public class EjercicioArbolBinario {

    public BinaryTree<Integer> isomorphicSumTree(BinaryTree<Integer> binaryTree) {
        if (binaryTree.isEmpty()) return binaryTree;

        return new BinaryTree<>(sum(binaryTree),
                isomorphicSumTree(binaryTree.getLeft()),
                isomorphicSumTree(binaryTree.getRight()));
    }

    private int sum(BinaryTree<Integer> binaryTree) {
        if (!binaryTree.isEmpty()) {
            if (binaryTree.getRoot() % 2 == 0) {
                return (binaryTree.getRoot() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight()));
            }
        } return 0;
    }

    public void inorder(BinaryTree<Integer> tree) {
        if (!tree.isEmpty()) {
            inorder(tree.getLeft());
            System.out.print(tree.getRoot() + " ");
            inorder(tree.getRight());
        }
    }
}
