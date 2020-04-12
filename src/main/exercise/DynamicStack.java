package exercise;

public class DynamicStack<T> implements StackInterface<T> {
    private Node<T> top;
    private int size = 0;

    @Override
    public void push(T element) {
        Node<T> aux = new Node<>(element);
        aux.next = top;
        top = aux;
        size++;
    }

    @Override
    public void pop() {
        if(top != null) {
            top = top.next;
            size--;
        }
    }

    @Override
    public T peek() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void empty() {
        top = null;
        size = 0;
    }
}
