package exercise;

public interface StackInterface<T> {
    void push(T element);
    void pop();
    T peek();
    boolean isEmpty();
    int size();
    void empty();
}
