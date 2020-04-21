package tp5;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

class TreeApiTest {

    TreeApi<Integer> treeApi = new TreeApi();

    BinaryTree<Integer> treeLeftLeft = new BinaryTree<>(25);
    BinaryTree<Integer> treeLeftRight = new BinaryTree<>(11);
    BinaryTree<Integer> treeRight = new BinaryTree<>(15);
    BinaryTree<Integer> treeLeft = new BinaryTree<>(11, treeLeftLeft, treeLeftRight);
    BinaryTree<Integer> tree = new BinaryTree<> (1, treeLeft, treeRight);

    BinaryTree<Integer> tree2 = new BinaryTree<> (1, treeLeft, treeRight);

    BinaryTree<Integer> treeLeftLeft3 = new BinaryTree<>(45);
    BinaryTree<Integer> treeLeftRight3 = new BinaryTree<>(70);
    BinaryTree<Integer> treeRight3 = new BinaryTree<>(3);
    BinaryTree<Integer> treeLeft3 = new BinaryTree<>(22, treeLeftLeft3, treeLeftRight3);
    BinaryTree<Integer> tree3 = new BinaryTree<> (81, treeLeft3, treeRight3);

    BinaryTree<Integer> treeLeftLeft4 = new BinaryTree<>(25);
    BinaryTree<Integer> treeLeftRight4 = new BinaryTree<>(46);
    BinaryTree<Integer> treeRight4 = new BinaryTree<>(15);
    BinaryTree<Integer> treeLeft4 = new BinaryTree<>(11, treeLeftRight4, treeLeftLeft4);
    BinaryTree<Integer> tree4 = new BinaryTree<> (1, treeLeft4, treeRight4);

    BinaryTree<Integer> treeLeftLeft5 = new BinaryTree<>(25);
    BinaryTree<Integer> treeLeftRight5 = new BinaryTree<>(46);
    BinaryTree<Integer> treeRight5 = new BinaryTree<>(15);
    BinaryTree<Integer> treeLeft5 = new BinaryTree<>(11, treeLeftRight4, treeLeftLeft4);
    BinaryTree<Integer> tree5 = new BinaryTree<> (1, treeLeft4, treeRight4);

    BinaryTree<Integer> treeRight6 = new BinaryTree<>(15);
    BinaryTree<Integer> treeLeft6 = new BinaryTree<>(11);
    BinaryTree<Integer> tree6 = new BinaryTree<> (1, treeLeft6, treeRight6);

    BinaryTree<Integer> treeRight7 = new BinaryTree<>();
    BinaryTree<Integer> treeLeft7 = new BinaryTree<>(11);
    BinaryTree<Integer> tree7 = new BinaryTree<> (1, treeLeft7, treeRight7);

    BinaryTree<Integer> tree8LeftLeft = new BinaryTree<>(50);
    BinaryTree<Integer> tree8LeftRight = new BinaryTree<>(80);
    BinaryTree<Integer> tree8Right = new BinaryTree<>(95);
    BinaryTree<Integer> tree8Left = new BinaryTree<>(90, tree8LeftLeft, tree8LeftRight);
    BinaryTree<Integer> tree8 = new BinaryTree<> (100, tree8Left, tree8Right);

    BinaryTree<Integer> tree9Left = new BinaryTree<>(11, treeLeftLeft, treeLeftRight);

    //BinaryTree<Integer> treeLeftLeft = new BinaryTree<>(25);
    //BinaryTree<Integer> treeLeftRight = new BinaryTree<>(11);
    //BinaryTree<Integer> treeRightRight= new BinaryTree<>(25);
    //BinaryTree<Integer> treeRight = new BinaryTree<>(15,new BinaryTree<>(),treeRightRight);
    //BinaryTree<Integer> treeLeft = new BinaryTree<>(11, treeLeftLeft, treeLeftRight);
    //BinaryTree<Integer> tree = new BinaryTree<> (1, treeLeft, treeRight);




    @Test
    void weight() {
        assertEquals(5, treeApi.weight(tree));
    }

    @Test
    void numberOfLeafs() {
        assertEquals(3, treeApi.numberOfLeafs(tree));
    }

    @Test
    void occurrences() {
        assertEquals(2, treeApi.occurrences(tree, 11));
        assertEquals(1, treeApi.occurrences(tree, 1));
        assertEquals(0, treeApi.occurrences(tree, 20));
    }

    @Test
    void elementPerLevel() {
        assertEquals(1, treeApi.elementPerLevel(tree, 0));
        assertEquals(2, treeApi.elementPerLevel(tree, 1));

    }

    @Test
    void height() {
        assertEquals(2, treeApi.height(tree));
    }

    @Test
    void elementSum() {
        assertEquals(63, treeApi.elementSum(tree));
    }

    @Test
    void threeDividersElementSum() {
        assertEquals(15, treeApi.threeDividersElementSum(tree));
    }

    @Test
    void areEquals() {
        assertEquals(true, treeApi.areEquals(tree,tree2));
    }

    @Test
    void areIsomorphic() {
        assertEquals(true, treeApi.areIsomorphic(tree,tree3));
    }

    @Test
    void areSimilar() {
        assertEquals(true, treeApi.areSimilar(tree4,tree5));
    }

    @Test
    void isComplete() {
        assertEquals(true, treeApi.isComplete(tree6));
        assertEquals(false, treeApi.isComplete(tree));
    }

    @Test
    void isFull() {
        assertEquals(true, treeApi.isFull(tree6));
        assertEquals(false, treeApi.isFull(tree7));
    }

    @Test
    void isStable() {
        assertEquals(true, treeApi.isStable(tree8));
    }

    @Test
    void itsInside() {
        assertEquals(true, treeApi.itsInside(tree, tree9Left));
    }

    @Test
    void frontierList() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(15);
        array.add(11);
        array.add(25);
        assertEquals(array, treeApi.frontierList(tree));
    }
}