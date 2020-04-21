package tp5;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class BinaryTree<T> {
    private DoubleNode<T> root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(T o){
        root = new DoubleNode <T>(o);
    }

    public BinaryTree(T o, BinaryTree<T> left, BinaryTree<T> right){
        root = new DoubleNode<T>(o,left.root, right.root);
    }

    public boolean isEmpty(){
        return root == null;
    }

    public T getRoot(){
        return root.data;
    }

    public BinaryTree<T> getLeft() {
        BinaryTree<T> temp = new BinaryTree<T>();
        temp.root = root.left;
        return temp;
    }

    public BinaryTree<T> getRight() {
        BinaryTree<T> temp = new BinaryTree<T>();
        temp.root = root.right;
        return temp;
    }
}