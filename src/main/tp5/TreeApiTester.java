package tp5;

public class TreeApiTester {
    public static void main(String[] args) {
        TreeApi<Integer> treeApi = new TreeApi();

        BinaryTree<Integer> treeLeftLeft = new BinaryTree<>(25);
        BinaryTree<Integer> treeLeftRight = new BinaryTree<>(11);
        BinaryTree<Integer> treeRight = new BinaryTree<>(15);
        BinaryTree<Integer> treeLeft = new BinaryTree<>(11, treeLeftLeft, treeLeftRight);
        BinaryTree<Integer> tree = new BinaryTree<> (1, treeLeft, treeRight);

        System.out.println("Inorden: ");
        treeApi.inorden(tree);

        System.out.println("\nPostorder: ");
        treeApi.postorder(tree);

        System.out.println("\nPreorder: ");
        treeApi.preorder(tree);

        System.out.println("\nBy levels: ");
        treeApi.byLevels(tree);
    }
}
