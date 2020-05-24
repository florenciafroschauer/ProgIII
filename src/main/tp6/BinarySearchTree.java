package tp6;

import tp5.BinaryTree;
import tp5.DoubleNode;
/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class BinarySearchTree<T> {
    private DoubleNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Comparable <T> x) {
        if (exists(x)) throw new RuntimeException("Element is already in the tree.");
        root = insert(root, x);
    }

    public void delete(Comparable <T> x) {
        if (!exists(x)) throw new RuntimeException("Element is not in the tree.");
        root = delete(root, x);
    }

    public T getMin() {
        if (isEmpty()) throw new RuntimeException("Tree is empty.");
        return getMin(root).data;
    }

    public T getMax() {
        if (isEmpty()) throw new RuntimeException("Tree is empty.");
        return getMax(root).data;
    }

    public T search(Comparable<T> x) {
        if (!exists(x)) throw new RuntimeException("Element is not in the tree.");
        return search(root, x).data;
    }

    public boolean exists(Comparable<T> x) {
        return exists(root, x);
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public T getRoot() {
        if(isEmpty()) throw new RuntimeException("Tree is empty.");
        return root.data;
    }

    public BinarySearchTree<T> getLeft() {
        if(isEmpty()) throw new RuntimeException("Tree is empty.");
        BinarySearchTree<T> t = new BinarySearchTree<T>();
        t.root = root.left;
        return t;
    }

    public BinarySearchTree<T> getRight() {
        if(isEmpty()) throw new RuntimeException("Tree is empty.");
        BinarySearchTree<T> t = new BinarySearchTree<T>();
        t.root = root.right;
        return t;
    }

    // METODOS PRIVADOS
    private DoubleNode<T> getMax(DoubleNode <T> t) {
        if (t.right == null) return t;
        else return getMax(t.right);
    }

    private DoubleNode<T> getMin(DoubleNode <T> t) {
        if (t.left == null)
            return t;
        else
            return getMin(t.left);
    }

    private DoubleNode<T> search(DoubleNode <T> t, Comparable<T> x) {
        if (x.compareTo(t.data) == 0) return t;
        else if (x.compareTo(t.data) < 0) return search(t.left, x);
        else return search(t.right, x);
    }

    private boolean exists(DoubleNode <T> t, Comparable<T> x) {
        if (t == null) return false;
        if (x.compareTo(t.data) == 0) return true;
        else if (x.compareTo(t.data) < 0) return exists(t.left, x);
        else return exists(t.right, x);
    }


    private DoubleNode<T> insert(DoubleNode <T> t, Comparable <T> x) {
        if (t == null) {
            t = new DoubleNode<T>();
            t.data = (T) x;
        }

        else if (x.compareTo(t.data) < 0) t.left = insert(t.left, x);
        else t.right = insert(t.right, x);
        return t;
    }


    private DoubleNode<T> delete(DoubleNode<T> t, Comparable<T> x) {
        if (x.compareTo(t.data) < 0)
            t.left = delete(t.left, x);
        else if (x.compareTo(t.data) > 0)
            t.right = delete(t.right, x);
        else
        if (t.left != null && t.right != null ) {
            t.data = getMin(t.right).data;
            t.right = deleteMin(t.right);
        }
        else if (t.left != null)
            t = t.left;
        else
            t = t.right;
        return t;
    }

    private DoubleNode<T> deleteMin(DoubleNode<T> t) {
        if (t.left != null)
            t.left = deleteMin(t.left);
        else
            t = t.right;
        return t;
    }

    public int height(BinarySearchTree tree) {
        if (tree.isEmpty()) return -1;
        else return 1 + Math.max(height(tree.getRight()), height(tree.getLeft()));
    }
}
