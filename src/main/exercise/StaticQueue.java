package exercise;

public class StaticQueue<T> implements QueueInterface<T> {
    private T[] data;
    private int front = 0;
    private int back = 0;
    private int amount = 0;
    private int capacity;

    public StaticQueue(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
    }

    @Override
    public void enqueue(T element) {
        if(capacity == amount) grow(data);
        incrementBack();

        if (back == 0){
            data[back] = element;
        }else{
            data[back-1] = element;
        }
        amount++;
    }

    @Override
    public T dequeue() {
        T element = data[front];
        front++;
        amount--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return (amount == 0);
    }

    @Override
    public int length() {
        return amount;
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public void empty() {
        front = 0;
        back = 0;
        amount = 0;
    }

    private void grow(T[] data) {
        T[] aux = (T[]) new Object[capacity * 2];
        if (front == 0) {
            for (int i = 0; i < data.length ; i++) {
                aux[i] = data[i];
                this.data = aux;
            }
        }

        if (front != 0) {
            for (int i = front, j = 0; i < data.length; i++, j++) {
                aux[j] = data[i];
            }

            for (int i = 0, j = (data.length - front); i < front ; i++, j++) {
                aux[j] = data[i];
            }

            this.data = aux;
        }
    }

    private void incrementBack() {
        if (back != capacity) back++;
        else {
            if (amount < capacity) back = 0;
        }
    }
}
