package tp5;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer
 */

public class DoubleNode<T> {
    public DoubleNode <T> right, left;
    public T data;

    public DoubleNode() {}

    public DoubleNode(T data) {
        this.data = data;
    }

    public DoubleNode(T data, DoubleNode<T> left, DoubleNode<T> right) {
        this.right = right;
        this.left = left;
        this.data = data;
    }
}
