package tp5;

import exercise.DynamicQueue;
import java.util.ArrayList;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class TreeApi<T> {

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
        if (tree.isEmpty()) return 0;
        if (tree.getRoot().equals(o)) return 1 + occurrences(tree.getLeft(), o) + occurrences(tree.getRight(), o);
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
            return (Integer) tree.getRoot() + elementSum(tree.getLeft()) + elementSum(tree.getRight());
        }
        return 0;
    }

    public int threeDividersElementSum(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            if ((Integer) tree.getRoot() % 3 == 0) {
                return (Integer) tree.getRoot() + threeDividersElementSum(tree.getLeft())
                        + threeDividersElementSum(tree.getRight());
            } else return threeDividersElementSum(tree.getLeft()) + threeDividersElementSum(tree.getRight());
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
            return areEquals(tree1.getRight(), tree2.getRight()) && areEquals(tree1.getLeft(), tree2.getLeft());
        }
        return false;
    }

    /**
     * Informa si los árboles binarios a1 y a2 son isomorfos
     */
    public boolean areIsomorphic(BinaryTree<T> tree1, BinaryTree<T> tree2) {
        if (tree1.isEmpty() && tree2.isEmpty()) {
            return true;
        } else {
            return areIsomorphic(tree1.getRight(), tree2.getRight())
                    && areIsomorphic(tree1.getLeft(), tree2.getLeft());
        }
    }

    /**
     * Informa si los árboles binarios a1 y a2, sin elementos repetidos son semejantes
     */
    public boolean areSimilar(BinaryTree<T> tree1, BinaryTree<T> tree2) {
        if (occurrences(tree2, tree1.getRoot()) == 1) {
            return occurrences(tree2, tree1.getLeft().getRoot()) == 1
                    && occurrences(tree2, tree1.getRight().getRoot()) == 1;
        } else return false;
    }

    /**
     * Indica si un árbol binario es completo
     */
    public boolean isComplete(BinaryTree<T> tree) {
        if (tree.isEmpty()) {
            return false;
        }
        else if ((tree.getLeft().isEmpty()) && (tree.getRight().isEmpty())) {
            return true;
        }
        else if ((tree.getLeft().isEmpty()) || (tree.getRight().isEmpty())) {
            return false;
        }
        return isComplete(tree.getLeft()) && isComplete(tree.getRight());
    }

    /**
     * Informa si un árbol binario está lleno
     */
    public boolean isFull(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            if (tree.getRight().isEmpty() && tree.getLeft().isEmpty()) {
                return true;
            }
            if (!(tree.getRight().isEmpty() && tree.getLeft().isEmpty())) {
                return isFull(tree.getLeft()) && isFull(tree.getRight());
            }
        }
        return false;
    }

    /**
     * Un árbol de valores enteros es estable si es vacío, consta de un único elemento o
     * para todo metodo  para todo elemento de la estructura su padre es mayor.
     */
    public boolean isStable(BinaryTree<T> tree) {
        if (tree.isEmpty() || tree.getLeft().isEmpty() && tree.getRight().isEmpty()) {
            return true;
        }
        if ((Integer)tree.getRoot() < (Integer)tree.getRight().getRoot()
                || (Integer)tree.getRoot() < (Integer)tree.getLeft().getRoot()) {
            return false;
        }

        isStable(tree.getRight());
        isStable(tree.getLeft());
        return true;
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

    /**
     * Se define frontera de un árbol binario, el conjunto formado por los elementos almacenados en las hojas
     */
    public void showBorder(BinaryTree<T> tree) {
        if (tree.isEmpty()) return;

        if (tree.getLeft().isEmpty() && tree.getRight().isEmpty()) {
            System.out.println(tree.getRoot());
        } else {
            showBorder(tree.getLeft());
            showBorder(tree.getRight());
        }
    }

    /**
     * Devuelve un ArrayList de la frontera de un arbol
     */
    public ArrayList<T> frontierList(BinaryTree<T> tree) {
        ArrayList<T> frontier = new ArrayList<>();
        if (tree.isEmpty()) {
            return frontier;
        }

        if ((!tree.getLeft().isEmpty() || (!tree.getRight().isEmpty()))) {
            ArrayList<T> frontier1 = new ArrayList<>();
            frontier1.addAll(frontierList(tree.getRight()));
            frontier1.addAll(frontierList(tree.getLeft()));
            return frontier1;
        }

        if ((tree.getLeft().isEmpty()) && (tree.getRight().isEmpty())){
             frontier.add(tree.getRoot());
        }
        return frontier;
    }

    public void inorder(BinaryTree<T> tree) {
        if (!tree.isEmpty()) {
            inorder(tree.getLeft());
            System.out.print(tree.getRoot() + " ");
            inorder(tree.getRight());
        }
    }

    public void postorder(BinaryTree<T> tree) {
        if (tree.isEmpty())
            return;

        postorder(tree.getLeft());
        postorder(tree.getRight());
        System.out.print(tree.getRoot() + " ");
    }

    public void preorder(BinaryTree<T> tree) {
        if (tree.isEmpty())
            return;

        System.out.print(tree.getRoot() + " ");
        preorder(tree.getLeft());
        preorder(tree.getRight());
    }

    public void byLevels (BinaryTree<T> tree) {
        DynamicQueue<BinaryTree> q = new DynamicQueue();
        q.enqueue(tree);

        while (!q.isEmpty()) {
            tree = q.dequeue();
            System.out.print(tree.getRoot() + " ");

            if (!tree.getLeft().isEmpty()) {
                q.enqueue(tree.getLeft());
            }

            if (!tree.getRight().isEmpty()) {
                q.enqueue(tree.getRight());
            }
        }
    }

    private int size(BinaryTree<T> a) {
        if (a.isEmpty()) return 0;
        else return 1 + size(a.getLeft()) + size(a.getRight());
    }
}
