package myPackage.arboles;

import exercise.DynamicList;
import tp5.BinaryTree;
import tp6.BinarySearchTree;

public class BTPractice<T extends Comparable<T>> {
    // exercise 1
    private DynamicList<T> deleteAccountList;
    // exercise 2
    private BinarySearchTree<String> bankBranchA;
    private BinarySearchTree<String> bankBranchB;

    public BTPractice() {
        deleteAccountList = new DynamicList<>();
        bankBranchA = new BinarySearchTree<>();
        bankBranchB = new BinarySearchTree<>();
    }

    /**
     * Un banco debe dar de baja un conjunto de cuentas corrientes. Tanto el conjunto total de
     * cuentas como el que debe ser dado de baja se encuentran implementados como una
     * estructura de árbol binario de búsqueda. Utilizando las funciones primitivas de ArBin y
     * ArBinBus, escribir una función que haga lo requerido por el banco.
     */

    public BinarySearchTree<T> deleteAccount(BinarySearchTree<T> totalAccount, BinarySearchTree<T> deleteAccount) {
        deleteAccountList = toList(deleteAccount);
        for (int i = 0; i < deleteAccountList.size() ; i++) {
            deleteAccountList.goTo(i);
            totalAccount.delete(deleteAccountList.getActual());
        }
        return totalAccount;
    }

    private DynamicList<T> toList(BinarySearchTree<T> binarySearchTree) {
        DynamicList<T> auxList = new DynamicList<>();
        auxMethod(binarySearchTree, auxList);
        return auxList;
    }

    private void auxMethod(BinarySearchTree<T> binarySearchTree, DynamicList<T> dynamicList) {
        if (!binarySearchTree.isEmpty()) {
            auxMethod(binarySearchTree.getLeft(), dynamicList);
            dynamicList.insertNext(binarySearchTree.getRoot());
            auxMethod(binarySearchTree.getRight(), dynamicList);
        }
    }

    public void printTree(BinarySearchTree<T> tree) {
        if (!tree.isEmpty()) {
            printTree(tree.getLeft());
            System.out.print(tree.getRoot() + " \n");
            printTree(tree.getRight());
        }
    }

    /**
     * Un Banco utiliza un árbol binario para guardar la información de las cuentas corrientes de los
     * clientes de dos sucursales. Cada cuenta se caracteriza por la sucursal (una letra que puede ser
     * ‘A’ o ‘B’) y un número. Para mayor eficiencia el depto. de sistemas ha decidido que a partir de
     * la información almacenada en el árbol binario construir dos árboles binarios de búsqueda, uno con
     * los clientes de la sucursal ‘A’ y el otro con los de la sucursal ‘B’.
     * Se pide hacer una aplicación que realice lo solicitado y un programa de prueba.
     */

    public void separateAccount(BinarySearchTree<String> bankBranch) {
        if (!bankBranch.isEmpty()) {
            separateAccount(bankBranch.getLeft());
            if (bankBranch.getRoot().contains("A")) {
                bankBranchA.insert(bankBranch.getRoot());
            } else if (bankBranch.getRoot().contains("B")) {
                bankBranchB.insert(bankBranch.getRoot());
            }
            separateAccount(bankBranch.getRight());
        }
    }

    public BinarySearchTree<String> getBankBranchA() {
        return bankBranchA;
    }

    public BinarySearchTree<String> getBankBranchB() {
        return bankBranchB;
    }

    public void printStringTree(BinarySearchTree<String> tree) {
        if (!tree.isEmpty()) {
            printTree((BinarySearchTree<T>) tree.getLeft());
            System.out.print(tree.getRoot() + " \n");
            printTree((BinarySearchTree<T>) tree.getRight());
        }
    }

    /**
     * Un método que recibe un árbol binario de números enteros y devuelve un árbol isomorfo en el cual
     * cada nodo contiene la suma de él junto con todos sus descendientes.
     */

    private int sum(BinaryTree<Integer> binaryTree) {
        if (binaryTree.isEmpty()) return 0;
        else return binaryTree.getRoot() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
    }

    public BinaryTree<Integer> isomorphicSumTree(BinaryTree<Integer> binaryTree) {
        if (binaryTree.isEmpty()) return binaryTree;
        return new BinaryTree<>(sum(binaryTree),
                isomorphicSumTree(binaryTree.getLeft()),
                isomorphicSumTree(binaryTree.getRight()));
    }

    public void inorder(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            inorder(tree.getLeft());
            System.out.print(tree.getRoot() + " ");
            inorder(tree.getRight());
        }
    }

    /**
     * Un método que determine si un objeto dado se encuentra en las hojas de un árbol binario (el árbol
     * puede tener elementos repetidos).
     */

    public boolean elementIsInLeafs(BinaryTree<T> binaryTree, T element) {
        if (element == null) return false;
        if (!binaryTree.isEmpty()) {

            if (binaryTree.getLeft().isEmpty() && binaryTree.getRight().isEmpty()) {
                    return binaryTree.getRoot().equals(element);
            }
            return elementIsInLeafs(binaryTree.getLeft(), element) || elementIsInLeafs(binaryTree.getRight(), element);

        } return false;
    }

    /**
     * En un árbol de búsqueda cuyo campo clave es de tipo entero, escribir un método que devuelva
     * el número de nodos cuya clave se encuentra en el rango [x1, x2].
     */

    private int counter = 0;
    public int keyInRange(BinarySearchTree<Integer> binarySearchTree, int x1, int x2) {
        if (binarySearchTree.isEmpty()) {
            int auxCounter = counter;
            counter = 0;
            return auxCounter;

        } else if (binarySearchTree.getRoot() >= x1 && binarySearchTree.getRoot() <= x2) {
            counter++;
        } return keyInRange(binarySearchTree.getLeft(), x1, x2) + keyInRange(binarySearchTree.getRight(), x1, x2);
    }

    /**
     * a) ArBin reflejar (ArBin a)
     * Dado un árbol binario a, este procedimiento retorna su reflejo. Esto es, para cada
     * elemento del árbol intercambia sus subárboles asociados
     */



     /** b) void reemplazarArBin(ArBin a, Objeto e1, Objeto e2)
     * Reemplaza en el árbol a todas las ocurrencias del objeto e1 por el objeto e2
     */



     /**  c) ArBin podar(ArBin a)
     * Elimina del árbol a todas sus hojas
     */
}
