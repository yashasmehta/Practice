package dsa.binarytree;

//Lowest Common Ancestor
public class LCA {

    public Node findLCA(Node root, Node n1, Node n2) {
        if(root == null) {
            return null;
        }

        if(root == n1 || root == n2) {
            return root;
        }

        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);

        if(left == null) { // both elements in right subtree
            return right;
        }

        if(right == null) { // both elements in left subtree
            return left;
        }

        return root; // both elements in diff subtree
    }
}
