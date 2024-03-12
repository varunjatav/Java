package Tree;

// Define the structure of a tree node

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor to create a new node
    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

// Define the BinaryTree class
class BinaryTree {
    // Root of the Binary Tree
    TreeNode root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // * Method to perform inorder traversal*/
    void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // * Method to perform pre order traversal*/
    void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // * Method to perform post order traversal*/
    void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    void searchNode(TreeNode node, int data) {
        if (node != null) {
            if (node.data == data) {
                System.out.println("The Node is : " + node.data);
            }
            else{
                preorderTraversal(node.left);
                preorderTraversal(node.right);
            }
           
        }
    }

    // * Method to create a sample binary tree
    void createSampleTree() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.right.right.left = new TreeNode(10);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTree tree = new BinaryTree();

        // Create a sample tree with 10 nodes
        tree.createSampleTree();

        // * Display the tree using inorder traversal*/
        System.out.println("Inorder Traversal of the Binary Tree:");
        tree.inorderTraversal(tree.root);

        // * Display the tree using pre order traversal*/
        System.out.println();
        System.out.println("Pre order Traversal of the Binary Tree:");
        tree.preorderTraversal(tree.root);

        // * Display the tree using post order traversal*/
        System.out.println();
        System.out.println("Post order Traversal of the Binary Tree:");
        tree.postOrderTraversal(tree.root);

        // * Searching the node which match the given data*/
        System.out.println();
        System.out.println("Searching Node using Pre order Traversal of the Binary Tree:");
        tree.searchNode(tree.root, 8);
    }
}