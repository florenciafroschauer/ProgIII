package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class StaticStackTest {
    StaticStack<Integer> myStack = new StaticStack<>(3);

    @Test
    public void push() {
        myStack.push(1);
        assert 1 == myStack.peek();

        myStack.push(2);
        assert 2 == myStack.peek();

        myStack.push(3);
        assert 3 == myStack.peek();
    }

    @Test
    public void duplicate() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        assert 6 == myStack.size();
    }

    @Test
    public void pop() {
        myStack.push(1);
        myStack.push(2);

        myStack.pop();
        assert 1 == myStack.peek();
    }

    @Test
    public void peek() {
        assertNull(myStack.peek());
        myStack.push(1);
        assert 1 == myStack.peek();
    }

    @Test
    public void isEmpty() {
        assertTrue(myStack.isEmpty());
        myStack.push(1);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void size() {
        assert 0 == myStack.size();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        assert 4 == myStack.size();
    }

    @Test
    public void empty() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        assertFalse(myStack.isEmpty());

        myStack.empty();
        assertTrue(myStack.isEmpty());
    }
}
