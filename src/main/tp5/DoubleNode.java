package tp5;

public class DoubleNode<T> {
    DoubleNode <T> right, left;
    T data;

    public DoubleNode(T o){
        data = o;
    }
    public DoubleNode(T o, DoubleNode<T> left, DoubleNode<T> right) {
        this.right = right;
        this.left = left;
        data = o;
    }
}
