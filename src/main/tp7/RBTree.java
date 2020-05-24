package tp7;

import static java.lang.Integer.max;
/**
 * @author Agustin Augurusa, Juan Cruz De Lorenzo, Florencia Froschauer.
 */

public class RBTree {
    TreeNode root = null;

    // Function to calculate the height of the tree
    public int height(TreeNode root) {
        int left, right;

        if (root == null
                || (root.children == null
                && root.children[1] == null)) {
            return 0;
        }
        left = height(root.children[0]);
        right = height(root.children[1]);

        return (max(left, right) + 1);
    }

    // Function to check if dir is equal to 0
    public int check(int dir) {
        return dir == 0 ? 1 : 0;
    }

    // Function to check if a node's color is red or not
    public boolean isRed(TreeNode node) {
        return node != null
                && node.color.equals("R");
    }

    // Function to perform single rotation
    public TreeNode singleRotate(TreeNode node, int dir) {
        TreeNode temp = node.children[check(dir)];
        node.children[check(dir)] = temp.children[dir];

        temp.children[dir] = node;
        root.color = "R";
        temp.color = "B";

        return temp;
    }

    // Function to perform double rotation
    public TreeNode doubleRotate(TreeNode node, int dir) {
        node.children[check(dir)] = singleRotate(node.children[check(dir)], check(dir));
        return singleRotate(node, dir);
    }

    // Function to insert a new node with given data
    public TreeNode insert(RBTree tree, int data) {
        if (tree.root == null) {
            tree.root = new TreeNode(data);
            if (tree.root == null)
                return null;
        } else {
            // A temporary root
            TreeNode temp = new TreeNode(data); // le puse data porque no sabia que ponerle, deberia ser null

            // Grandparent and Parent
            TreeNode g, t;
            TreeNode p, q;

            int dir = 0, last = 0;
            t = temp;
            g = p = null;
            t.children[1] = tree.root;
            q = t.children[1];

            while (true) {
                if (q == null) {

                    // Inserting root node
                    q = new TreeNode(data);
                    p.children[dir] = q;
                }

                // Sibling is red
                else if (isRed(q.children[0])
                        && isRed(q.children[1])) {

                    // Recoloring if both children are red
                    q.color = "R";
                    q.children[0].color = "B";
                    q.children[1].color = "B";
                }

                if (isRed(q) && isRed(p)) {

                    // Resolving red-red violation
                    int dir2;
                    if (t.children[1] == g) {
                        dir2 = 1;
                    } else {
                        dir2 = 0;
                    }

                    // If children and parent are left-left or right-right of grand-parent
                    if (q == p.children[last]) {
                        t.children[dir2]
                                = singleRotate(g,
                                last == 0
                                        ? 1
                                        : 0);
                    }

                    // If they are opposite childs i.e left-right or right-left
                    else {
                        t.children[dir2] = doubleRotate(g, last == 0 ? 1 : 0);
                    }
                }

                // Checking for correct  position of node
                if (q.data == data) {
                    break;
                }
                last = dir;

                // Finding the path to  traverse [Either left or right ]
                dir = (q.data - data) < 0 ? 1 : 0;

                if (g != null) {
                    t = g;
                }

                // Rearranging pointers
                g = p;
                p = q;
                q = q.children[dir];
            }

            tree.root = temp.children[1];
        }

        // Assign black color to the root node
        tree.root.color = "B";

        return tree.root;
    }

    // Print nodes at each level in level order traversal
    public void printLevel(TreeNode root, int i) {
        if (root == null) {
            return;
        }

        if (i == 1) {
            System.out.print("| "
                    + root.data
                    + " | "
                    + root.color
                    + " |");

            if (root.children[0] != null) {
                System.out.print(" "
                        + root.children[0].data
                        + " |");
            } else {
                System.out.print(" "
                        + "NULL"
                        + " |");
            }

            if (root.children[1] != null) {
                System.out.print(" "
                        + root.children[1].data
                        + " |");
            } else {
                System.out.print(" "
                        + "NULL"
                        + " |");
            }

            System.out.print(" ");
            return;
        }

        printLevel(root.children[0], i - 1);
        printLevel(root.children[1], i - 1);
    }

    // Utility Function to perform level order traversal
    public void levelOrder(TreeNode root) {
        int i;

        for (i = 1; i < height(root) + 1; i++) {
            printLevel(root, i);
            System.out.print("\n\n");
        }
    }
}
