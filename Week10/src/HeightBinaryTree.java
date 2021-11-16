public class HeightBinaryTree {
    public static int height(Node root) {
        // Write your code here.
        int leftHeight = (root.left == null ? -1 : height(root.left));
        int rightHeight = (root.right == null ? -1 : height(root.right));
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
