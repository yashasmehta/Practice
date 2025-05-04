package dsa.binarytree;

import java.util.Scanner;

public class BinaryTree {
    private final Scanner sc;

    public BinaryTree() {
        sc = new Scanner(System.in);
    }

    public Node createTree() {
        Node root = null;
        System.out.println("Enter Data");
        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        root = new Node(data);
        System.out.println("Enter Left of " + data);
        root.left = createTree();

        System.out.println("Enter Right of " + data);
        root.right = createTree();

        return root;
    }

    public void inOrder(Node root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public int height(Node root) {
        if(root ==  null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public int size(Node root) {
        if(root ==  null) {
            return 0;
        }

        return size(root.left) + size(root.right) + 1;
    }

    public int maximum(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createTree();
        System.out.println("InOrder... ");
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println("PreOrder... ");
        binaryTree.preOrder(root);
        System.out.println();
        System.out.println("PostOrder... ");
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println("Height: " + binaryTree.height(root));
        System.out.println();
        // total no. of nodes
        System.out.println("Size: " + binaryTree.size(root));
        System.out.println();
        // find max value in tree
        System.out.println("Max Value: " + binaryTree.maximum(root));
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
