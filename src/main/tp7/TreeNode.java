package tp7;

public class TreeNode {
    int data;
    String color;
    TreeNode[] children;

    public TreeNode(int data) {
        this.data = data;
        this.color = "R";

        children = new TreeNode[2];
        children[0] = null;
        children[1] = null;
    }
}
