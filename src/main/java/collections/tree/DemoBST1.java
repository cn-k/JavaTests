package collections.tree;

public class DemoBST1 {

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root;

    DemoBST1() {
        root = null;
    }

    public TreeNode insert(TreeNode root, int dataToBeInserted) {
        if (root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (root.data > dataToBeInserted) {
            root.left = insert(root.left, dataToBeInserted);
        }
        else if (root.data < dataToBeInserted) {
            root.right = insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearched) {
        if (root == null) {
            return root;
        }
        if (root.data > dataToBeSearched) {
            return search(root.left, dataToBeSearched);
        }
        else {
            return search(root.right, dataToBeSearched);
        }
    }
    public void inOrder(TreeNode root){
        if(root == null)return;
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }
    public void insertIntoTree(int dataToBeInserted){
        root = insert(root, dataToBeInserted);
    }
    public TreeNode searchTree(int dataToBeSearched){
        return search(root, dataToBeSearched);
    }
    public void inOrderTraversal(){
        inOrder(root);
    }

    public static void main(String[] args) {
        DemoBST1 bst = new DemoBST1();
        bst.insertIntoTree(20);
        bst.insertIntoTree(25);
        bst.insertIntoTree(9);
        bst.insertIntoTree(19);
        bst.insertIntoTree(30);
        bst.insertIntoTree(1);
        bst.insertIntoTree(15);
        bst.inOrderTraversal();
    }
}