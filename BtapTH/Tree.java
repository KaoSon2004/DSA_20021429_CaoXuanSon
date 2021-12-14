import java.util.*;

public class Tree {
    static Node root;
    static List<Integer> arr;
    public static void list() {
        arr = new ArrayList<>();
    }

    public Tree() {
        root = null;
    }
    public Tree(int data) {
        root = new Node(data, null, new ArrayList<>());
    }
    static class Node {
        int data;
        boolean visited;
        Node parent;
        List<Node> children;

        public Node(int data, Node parent, List<Node> children) {
            this.data = data;
            this.parent = parent;
            this.children = children;
            this.visited = false;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    static Node find(Node root, int data) {
        if (root.data == data) {
            return root;
        }
        for (int i = 0; i < root.children.size(); i++) {
            if (find(root.children.get(i) ,data) != null) return root.children.get(i);
        }
        return null;
    }

    static void insertNode(Node root, int parent, int newInt) {
        if (root.data == parent) {
            root.children.add(new Node(newInt, root, new ArrayList<>()));
        } else {
            Node x = find(root, parent);
            x.children.add(new Node(newInt, root, new ArrayList<>()));
        }
    }

    static void delete(Node root, int key) {
        if (root.data == key) {
            root =null;
        }
        else {
            Node temp =find(root,key);
            temp = null;
        }
    }

    static boolean isBinaryTree(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            int n = que.size();
            while (n > 0) {
                Node temp = que.remove();
                if(temp.children.size() > 2 ) {
                    return false;
                }
                for(Node i : temp.children) {
                    que.add(i);
                }
                n--;
            }
        }
        return true;
    }
    static void BT(Node root) {
        if(root.children.size() == 2) {
            if (root.children.get(0) != null) {
                BT(root.children.get(0));
            }
            arr.add(root.data);
            if (root.children.get(1) != null) {
                BT(root.children.get(1));
            }
        }
        else if (root.children.size() == 1) {
            if(root.children.get(0) != null) {
                BT(root.children.get(0));
            }
            arr.add(root.data);
        }
    }
    static boolean isBinarySearchTree(Node root) {
        if(isBinaryTree(root) == false) {
            return false;
        }
        list();
        BT(root);
        for (int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i) >= arr.get(i+1)) {
                return false;
            }
        }
        return true;
    }

//    static boolean isMaxBinaryHeap(Node root) {
//        if (isBinaryTree(root) == false)
//            return false;
//    }

    static int height(Node root) {
        if (root==null) return -1;
        int maxHeight = -1;
        for (Node i : root.children){
            int height=height(i);
            maxHeight = Math.max(height, maxHeight);
        }
        return 1 + maxHeight;
    }

//    static void print() {
//        System.out.println(root.data);
//        print(root);
//    }
    static void print(Node root) {

        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            int n = que.size();
            while (n > 0) {
                Node temp = que.remove();
                System.out.println(temp.data);
                for(Node i : temp.children) {
                    que.add(i);
                }
                n--;
            }
        }

    }

    static public void preorder(Node root) {
        System.out.println(root.data);
        for (Node i : root.children) {
            preorder(i);
        }
    }

    static public void postorder(Node root) {
        for (Node i : root.children) {
            postorder(i);
        }
        System.out.println(root.data);
    }

    public static void main(String[] args) {
//        Tree tree = new Tree(1);
//        tree.insertNode(tree.root, 1,2);
//        tree.insertNode(tree.root,1,3);
//        tree.insertNode(tree.root,1,6);
//        tree.insertNode(tree.root, 2,4);
//        tree.insertNode(tree.root, 3,5);
//        tree.print(tree.root);
//        System.out.println(tree.height(tree.root));
        //tree.preorder(tree.root);
        //System.out.println(tree.isBinaryTree(tree.root));
        Tree tree = new Tree(7);
        tree.insertNode(tree.root, 7,5);
        tree.insertNode(tree.root,7,2);
        tree.insertNode(tree.root,5,1);
        tree.insertNode(tree.root, 5,4);
        tree.insertNode(tree.root, 2,0);
        //tree.insertNode(tree.root,2,7);
        //System.out.println(height(tree.root));
        System.out.println(tree.isBinarySearchTree(tree.root));

    }
}