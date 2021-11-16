public class isABinaryTree {
    private List<Integer> list;
    public void list() {
        list = new ArrayList();
    }
    void BST(Node root) {
        if (root.left!=null) {
            BST(root.left);
        }
        list.add(root.data);
        if (root.right!=null) {
            BST(root.right);
        }
    }
    boolean checkBST(Node root) {
        list();
        BST(root);
        for (int i = 0 ; i < list.size() - 1 ; i++) {
            if (list.get(i) >= list.get(i+1)) {
                return false;
            }

        }
        return true;
    }
}
