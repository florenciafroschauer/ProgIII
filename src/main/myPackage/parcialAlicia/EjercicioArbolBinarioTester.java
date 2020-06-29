package myPackage.parcialAlicia;

import tp5.BinaryTree;

/**
 * @author florenciafroschaer
 */
public class EjercicioArbolBinarioTester {
    public static void main(String[] args) {
        EjercicioArbolBinario ejercicio = new EjercicioArbolBinario();

        BinaryTree<Integer> left2 = new BinaryTree<Integer>(3);
        BinaryTree<Integer> right2 = new BinaryTree<>(2);

        BinaryTree<Integer> left = new BinaryTree<>(4, left2, right2);

        BinaryTree<Integer> right3 = new BinaryTree<>(7);
        BinaryTree<Integer> left3 = new BinaryTree<>(8);

        BinaryTree<Integer> right = new BinaryTree<>(6, left3, right3);

        BinaryTree<Integer> binaryTree = new BinaryTree<>(5, left, right);

        System.out.println("Recorrido inorden del arbol dado: ");
        ejercicio.inorder(binaryTree);
        System.out.println("\nRecorrido inorden del arbol luego de aplicar el metodo: ");
        ejercicio.inorder(ejercicio.isomorphicSumTree(binaryTree));
    }
}
