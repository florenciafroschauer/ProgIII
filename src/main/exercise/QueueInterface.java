package exercise;

public interface QueueInterface<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    int length();
    int size();
    void empty();
}
