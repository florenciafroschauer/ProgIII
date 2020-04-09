package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class StaticQueueTest {
    StaticQueue<Integer> myQueue = new StaticQueue<>(2);

    @Test
    public void enqueue() {
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        assert 3 == myQueue.length();
        assert 4 == myQueue.size();
    }

    @Test
    public void dequeue() {
        myQueue.enqueue(1);
        myQueue.enqueue(2);

        assert 1 == myQueue.dequeue();
        assert 1 == myQueue.length();
    }

    @Test
    public void isEmpty() {
        assertTrue(myQueue.isEmpty());
        myQueue.enqueue(1);
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void length() {
        assert 0 == myQueue.length();
        myQueue.enqueue(2);
        assert 1 == myQueue.length();
    }

    @Test
    public void size() {
        assert 2 == myQueue.size();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        assert 4 == myQueue.size();
    }

    @Test
    public void empty() {
        myQueue.enqueue(1);
        assertFalse(myQueue.isEmpty());

        myQueue.empty();
        assertTrue(myQueue.isEmpty());
    }
}
