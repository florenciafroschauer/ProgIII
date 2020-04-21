package tp5;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class TreeApiTest {

    TreeApi<Integer> treeApi = new TreeApi();

    BinaryTree<Integer> treeLeftLeft = new BinaryTree<>(new Integer(25));
    BinaryTree<Integer> treeLeftRight = new BinaryTree<>(new Integer(11));
    BinaryTree<Integer> treeRight = new BinaryTree<>(new Integer(15));
    BinaryTree<Integer> treeLeft = new BinaryTree<>(new Integer(45), treeLeftLeft, treeLeftRight);
    BinaryTree<Integer> tree = new BinaryTree<>(new Integer(1), treeLeft, treeRight);

    @Test
    void weight() {

    }

    @Test
    void numberOfLeafs() {
    }

    @Test
    void occurrences() {
    }

    @Test
    void elementPerLevel() {
    }

    @Test
    void height() {
    }

    @Test
    void elementSum() {
    }

    @Test
    void threeDividersElementSum() {
    }

    @Test
    void areEquals() {
    }

    @Test
    void areIsomorph() {
    }

    @Test
    void areSimilar() {
    }

    @Test
    void isComplete() {
    }

    @Test
    void isFull() {
    }

    @Test
    void estable() {
    }

    @Test
    void itsInside() {
    }

    @Test
    void showBorder() {
    }
}