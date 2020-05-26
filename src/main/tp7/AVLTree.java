package tp7;

/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class AVLTree<T> {
    private AVLNode<T> root;

    private static class AVLNode<T> {
        private T t;
        private int height;
        private AVLNode<T> left;
        private AVLNode<T> right;

        private AVLNode(T t) {
            this.t = t;
            height = 1;
        }
    }

    public void insert(T value) {
        root = insert(root, value);
    }

    private AVLNode<T> insert(AVLNode<T> n, T v) {
        if (n == null) {
            n = new AVLNode<T>(v);
            return n;
        } else {
            int k = ((Comparable) n.t).compareTo(v);
            if (k > 0) {
                n.left = insert(n.left, v);
            } else {
                n.right = insert(n.right, v);
            }
            n.height = Math.max(height(n.left), height(n.right)) + 1;
            int heightDiff = heightDiff(n);
            if (heightDiff < -1) {
                if (heightDiff(n.right) > 0) {
                    n.right = rightRotate(n.right);
                    return leftRotate(n);
                } else {
                    return leftRotate(n);
                }
            } else if (heightDiff > 1) {
                if (heightDiff(n.left) < 0) {
                    n.left = leftRotate(n.left);
                    return rightRotate(n);
                } else {
                    return rightRotate(n);
                }
            } else ;

        }
        return n;
    }

    private AVLNode<T> leftRotate(AVLNode<T> n) {
        AVLNode<T> r = n.right;
        n.right = r.left;
        r.left = n;
        n.height = Math.max(height(n.left), height(n.right)) + 1;
        r.height = Math.max(height(r.left), height(r.right)) + 1;
        return r;
    }

    private AVLNode<T> rightRotate(AVLNode<T> n) {
        AVLNode<T> r = n.left;
        n.left = r.right;
        r.right = n;
        n.height = Math.max(height(n.left), height(n.right)) + 1;
        r.height = Math.max(height(r.left), height(r.right)) + 1;
        return r;
    }

    private int heightDiff(AVLNode<T> a) {
        if (a == null) {
            return 0;
        }
        return height(a.left) - height(a.right);
    }

    public int height(AVLNode<T> a) {
        if (a == null) {
            return 0;
        }
        return a.height;
    }

    public int searchTries(Comparable<Integer> x) {
        return searchTries(root, x);
    }

    private int tries = 1;
    public int searchTries(AVLNode t, Comparable<Integer> x) {
        if (x.compareTo((int)t.t) == 0) {
            int auxTries = tries;
            tries = 0;
            return auxTries;
        } else if (x.compareTo((int)t.t) < 0) {
            tries++;
            return searchTries(t.left, x);
        } else {
            tries++;
            return searchTries(t.right, x);
        }
    }

    public int getHeight(AVLTree<T> a) {
        if (a.isEmpty()) {
            return -1;
        }
        int leftChildHeight = getHeight(a.getLeft());
        int rightChildHeight = getHeight(a.getRight());

        if (leftChildHeight > rightChildHeight) {
            return ++leftChildHeight;
        }
        return ++rightChildHeight;
    }

    public AVLTree<T> getLeft() {
        try {
            if (isEmpty()) {
                throw new RuntimeException(" Empty Tree");
            }
            AVLTree<T> t = new AVLTree<>();
            t.root = root.left;
            return t;
        } catch (Exception e) {
            System.out.println(" Empty Tree");
        }
        return null;
    }

    public AVLTree<T> getRight() {
        try {
            if (isEmpty()) {
                throw new RuntimeException(" Empty Tree");
            }
            AVLTree<T> t = new AVLTree<>();
            t.root = root.right;
            return t;
        } catch (Exception e) {
            System.out.println(" Empty Tree");
        }
        return null;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public T getRoot() {
        try {
            if (isEmpty()) {
                throw new RuntimeException(" Empty Tree");
            }
            return root.t;
        } catch (Exception e) {
            System.out.println(" Empty Tree");
        } return null;
    }
}
