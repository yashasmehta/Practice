package dsa.binarytree;

public class FlattenBTToLinkedList {
    BinaryTree binaryTree;
    Node prev = null;
    Node head = null;

    public FlattenBTToLinkedList() {
        binaryTree = new BinaryTree();
    }
    public void flatten(Node root) {
        if(root == null) {
            return;
        }

        flatten(root.left);

        if(prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }

        flatten(root.right);
    }

    public static void main(String[] args) {
        FlattenBTToLinkedList flattenBTToLinkedList = new FlattenBTToLinkedList();
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createTree();
        flattenBTToLinkedList.flatten(root);

        Node curr = flattenBTToLinkedList.head;

        while(curr != null) {
            System.out.println(curr.data + "-> ");
            curr = curr.right;
        }
    }
}
