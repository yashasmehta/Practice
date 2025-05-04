package dsa.bst;

import java.util.HashSet;
import java.util.Set;

public class BST {
    Node prev = null;
    public boolean search(Node root, int x) {
        if(root ==  null) {
            return false;
        }

        if(root.data == x) {
            return true;
        }

        if(x < root.data) {
            return search(root.left, x);
        }

        return search(root.right, x);
    }

    public Node insertRecursive(Node root, int x) {
        if(root == null) {
            return new Node(x);
        }

        if(x < root.data) {
            root.left = insertRecursive(root.left, x);
        } else {
            root.right = insertRecursive(root.right, x);
        }

        return root;
    }

    public Node insertIterative(Node root, int x) {
        Node newNode = new Node(x);
        Node curr = root;
        Node parent = null;

        while(curr != null) {
            parent = curr;

            if(x < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if(parent == null) {
            return newNode;
        }

        if(x < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        return root;
    }

    public boolean isBST(Node root) {
        if(root != null) {
            if(!isBST(root.left)) {
                return false;
            }

            if(prev != null && root.data <= prev.data) {
                return false;
            }

            prev = root;

            return isBST(root.right);
        }

        return true;
    }

    public boolean ifPairWithGivenSumPresent(Node root, int sum) {
        Set<Integer> set = new HashSet<>();
        return isPairUtil(root, sum, set);
    }

    private boolean isPairUtil(Node root, int sum, Set<Integer> set) {
        if(root == null) {
            return false;
        }

        if(isPairUtil(root.left, sum, set)) {
            return true;
        }

        if(set.contains(sum - root.data)) {
            return true;
        }

        set.add(root.data);

        return isPairUtil(root.right, sum, set);
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
