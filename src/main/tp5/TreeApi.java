package tp5;

/**
 *     Hacer una clase de aplicación que contenga:
 *             ➢ Los métodos correspondientes a los algoritmos de los ejercicios 13 y 14 de la guía de ejercicios de “Árboles Binarios”.
 *             Ejercicio 13
 *     Utilizando las primitivas de árbol binario escribir los métodos para calcular:
 *     a) el peso.
 *     b) el número de hojas.
 *     c) el número de veces que aparece un elemento dado.
 *             d) el número de elementos que tienen el árbol en un nivel dado.
 *     e) la altura.
 *
 *     Ejercicio 14:
 *
 *         a) Se dispone de un árbol binario de elementos de tipo entero. Escribir métodos que calculen:
 *         la suma de sus elementos.
 *                 la suma de sus elementos que son múltiplos de 3.
 *     b) Escribir métodos para resolver los siguientes ejercicios.
 *         boolean iguales ( Arbin a1, Arbin a2 ) /* Indica si dos árboles binarios son iguales */

import exercise.DynamicQueue;
import exercise.Node;*        boolean isomorfos(Arbin a1,Arbin a2) /* Informa si los árboles binarios a1 y a2 son isomorfos */
         *boolean semejantes(Arbin a1,Arbin a2) /* Informa si los árboles binarios a1 y a2, sin elementos repetidos son semejantes */
         *boolean completo(Arbin a) /* Indica si un árbol binario es completo */
         *boolean lleno(Arbin a) /* Informa si un árbol binario está lleno */
         *boolean estable(Arbin a) /* Un árbol de valores enteros es estable si es vacío, consta de un único elemento o para todo elemento de la estructura su padre es mayor. */
         *boolean ocurreArbin(Arbin a1,Arbin a2) /* Indica si el árbol a2 ocurre en el árbol a1
  * void mostrarFrontera(Arbin a) /* Se define frontera de un árbol binario, el conjunto formado por los elementos almacenados en las hojas.
  * ArrayList frontera( Arbin a, Object elem ) /* Retorna un ArrayList con la frontera */
 *
 *             ➢ Los métodos que muestran el árbol:
 *             ▪ en preorden.
 *             ▪ en inorden.
 *             ▪ en postorden.
 *             ▪ por niveles.
 *             ➢ Hacer un programa de prueba.
 */
public class TreeApi<T> {

    public int size(BinaryTree<T> a) {
        if (a.isEmpty()) return 0;
        else return 1 + size(a.getLeft()) + size(a.getRight());
    }

    public int completeNodes(BinaryTree<T> a) {
        if (a.isEmpty()) return 0;
        if (a.getLeft().isEmpty()) return completeNodes(a.getRight());
        if (a.getRight().isEmpty()) return completeNodes(a.getLeft());

        return 1 + completeNodes(a.getRight()) + completeNodes(a.getLeft());
    }

    public int ocurrencias(BinaryTree<T> a, T o) {
        if (a.isEmpty()) return 0;
        if (a.getRoot().equals(o)) return 1 + ocurrencias(a.getLeft(), o) + ocurrencias(a.getRight(), o);
        else return ocurrencias(a.getLeft(), o) + ocurrencias(a.getRight(), o);
    }

    public void inorden(BinaryTree<T> a) {
        if (!a.isEmpty()) {
            inorden(a.getLeft());
            System.out.println(a.getRoot());
            inorden(a.getRight());
        }
    }


    /**
     * Ejercicio 13. a) el peso
     */
    public int weight(BinaryTree<T> tree) {
        if (tree.isEmpty()) return 0;
        else return 1 + size(tree.getLeft()) + size(tree.getRight());
    }

    /**
     * b) el número de hojas
     */
    public int numberOfLeafs(BinaryTree<T> tree) {
        if (tree.isEmpty()) {
            return 0;
        }
        if (tree.getLeft().isEmpty() && tree.getRight().isEmpty()) {
            return 1;
        }

        return numberOfLeafs(tree.getLeft()) + numberOfLeafs(tree.getRight());
    }

    /**
     * c) el número de veces que aparece un elemento dado
     */
    public int occurrences(BinaryTree<T> tree, T o) {
        if (tree.isEmpty())
            return 0;
        if (tree.getRoot().equals(o))
            return 1 + occurrences(tree.getLeft(), o) + occurrences(tree.getRight(), o);
        else return occurrences(tree.getLeft(), o) + occurrences(tree.getRight(), o);
    }

    /**
     * d) el número de elementos que tienen el árbol en un nivel dado
     */
    public int elementPerLevel(BinaryTree<T> tree, int level) {
        if (tree.isEmpty()) return 0;
        if (level > 0) {
            return elementPerLevel(tree.getLeft(), level - 1)
                    + elementPerLevel(tree.getRight(), level - 1);
        } else return 1;
    }

    /**
     * e) la altura
     */
    public int height(BinaryTree<T> tree) {
        if (tree.isEmpty()) return -1;

        else return 1 + Math.max(height(tree.getRight()), height(tree.getLeft()));
    }

    /**
     * Ejercicio 14. a) suma de sus elementos
     */
    public int elementSum(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            return (int) tree.getRoot() + elementSum(tree.getLeft()) + elementSum(tree.getRight());
        }
        return 0;
    }

    public int threeDividersElementSum(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            if ((int) tree.getRoot() % 3 == 0) {
                return (int) tree.getRoot() + elementSum(tree.getLeft()) + elementSum(tree.getRight());
            } else return elementSum(tree.getLeft()) + elementSum(tree.getRight());

        }
        return 0;
    }

    /**
     * Indica si dos árboles binarios son iguales
     */
    public boolean areEquals(BinaryTree<T> tree1, BinaryTree<T> tree2) {
        if (tree1.isEmpty() && tree2.isEmpty()) {
            return true;
        } else if (tree1.getRoot().equals(tree2.getRoot())) {
            return areEquals(tree1.getRight(), tree2.getRight())
                    && areEquals(tree1.getLeft(), tree2.getLeft());
        }
        return false;
    }

    /**
     * Informa si los árboles binarios a1 y a2 son isomorfos
     */
    public boolean areIsomorph(BinaryTree<T> tree1, BinaryTree<T> tree2) {
        if (tree1.isEmpty() && tree2.isEmpty()) {
            return true;
        } else {
            return areIsomorph(tree1.getRight(), tree2.getRight())
                    && areEquals(tree1.getLeft(), tree2.getLeft());
        }
    }

    /**
     * Informa si los árboles binarios a1 y a2, sin elementos repetidos son semejantes
     */
    public boolean areSimilar(BinaryTree<T> tree1, BinaryTree<T> tree2) {
        if (occurrences(tree2, tree1.getRoot() == 1))
            return occurrences(tree2, tree1.getLeft()) == 1 && return occurrences(tree2, tree1.getRight()) == 1;
            else return false;
    }

    /**
     * Indica si un árbol binario es completo
     */
    public boolean isComplete(BinaryTree<T> tree) {
        if (tree.isEmpty()) {
            return false;
        }
        if (!tree.isEmpty())
            return true;
        return isComplete(tree.getLeft()) && isComplete(tree.getRight());
    }

    /**
     * Informa si un árbol binario está lleno
     */
    public boolean isFull(BinaryTree<T> tree) {
        if (tree != null) {
            if (tree.getRight().isEmpty() && tree.getLeft().isEmpty()) {
                return true;
            }
            if (!(tree.getRight().isEmpty() && tree.getLeft().isEmpty())) {
                return isFull(tree.getLeft()) && isFull(tree.getLeft());
            }
        }
        return false;
    }

    /**
     * Un árbol de valores enteros es estable si es
     * vacío, consta de un único elemento o para todo elemento de la estructura su padre es mayor.
     */
    public boolean estable(BinaryTree<T> tree) {
        if (tree.isEmpty()) {
            return true;
        } else if (tree.getRoot() > tree.getLeft() && tree.getRoot() > tree.getRight()) {
            return estable(tree.getLeft()) && estable(tree.getRight());
        }
        return false;
    }

    /**
     * Indica si el árbol a2 ocurre en el árbol a1
     */
    public boolean itsInside(BinaryTree<T> tree1, BinaryTree<T> tree2) {
        if (tree2.isEmpty()) return true;
        if (tree1.isEmpty()) return false;
        if (areEquals(tree1, tree2)) return true;

        return itsInside(tree1.getLeft(), tree2) || itsInside(tree1.getRight(), tree2);
    }

    /* Se define frontera de un árbol binario, el conjunto formado por los elementos almacenados en las hojas */
    public void showBorder(BinaryTree<T> tree) {
        if (tree.isEmpty()) {
            return;
        }
        if (tree.getLeft().isEmpty() && tree.getRight().isEmpty()) {
            System.out.println();
            (tree.getRoot());
                else
            showBorder(tree.getLeft());
            showBorder(tree.getRight());
        }
    }

    public void inorden(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            inorden(tree.getLeft());
            System.out.println(tree.getRoot());
        }
        inorden(tree.getRight());
    }


    public void byLevel(BinaryTree<T> tree) {
        DynamicQueue queue = new DynamicQueue();
        queue.enqueue(tree.getRoot());
        while (!queue.isEmpty()) {
            int nodeCount = q.size();
            Node node = q.peek();
            System.out.print(node.data + " ");
            enqueue.remove();
            if (tree.getLeft().isEmpty())
                enqueue.add(tree.getLeft());
            if (!tree.getRight().isEmpty())
                enqueue.add(tree.getRight());
            nodeCount--;
        }System.out.println();
    }

    public void printPostorder(BinaryTree<T> tree){
        if (tree.isEmpty())
            return;

        printPostorder(tree.getLeft());

        // then recur on right subtree
        printPostorder(tree.getRight());

        System.out.print(tree.getRoot() + " ");
    }


    public void printPreorder(BinaryTree<T> tree) {
        if (tree.isEmpty())
            return;

        System.out.print(tree.getRoot() + " ");

        printPreorder(tree.getLeft());

        printPreorder(tree.getRight());
    }

}
