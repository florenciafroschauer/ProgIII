package tp5;

public class BinaryTree<T> {
    private DoubleNode<T> root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(T o){
        root = new DoubleNode <T>(o);
    }

    public BinaryTree(T o, BinaryTree<T> tleft, BinaryTree<T> tright){
        root = new DoubleNode<T>(o,tleft.root, tright.root);
    }

    public boolean isEmpty(){
        return root == null;
    }
    public T getRoot(){
        return root.dato;
    }
    public BinaryTree<T> getLeft(){
        BinaryTree<T> t = new BinaryTree<T>();
        t.root = root.left;
        return t;
    }
    public BinaryTree<T> getRight(){
        BinaryTree<T> t = new BinaryTree<T>();
        t.root = root.right;
        return t;
    }

}