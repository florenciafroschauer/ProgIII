package exercise;

public class StaticStack<T> implements StackInterface<T> {
    private T[] data;
    private int top = -1;
    private int capacity;

    public StaticStack(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
    }

    @Override
    public void push(T element) {
        top++;
        if(top == data.length) grow(data);

        this.data[top] = element;
    }

    @Override
    public void pop() {
        if(!isEmpty()) {
            top--;
        }
    }

    @Override
    public T peek() {
        if(!isEmpty()) return (T) data[top];
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public int size() {
        int counter = 0;
        for (T element: data) {
            if(element != null) counter++;
        }

        return counter;
    }

    @Override
    public void empty() {
        top = -1;
    }

    private void grow(T[] data) {
        T[] aux = (T[]) new Object[capacity * 2];

        for (int i = 0; i < data.length ; i++) aux[i] = data[i];
        this.data = aux;
    }
}
