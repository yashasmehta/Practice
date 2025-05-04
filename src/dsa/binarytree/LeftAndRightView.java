package dsa.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LeftAndRightView {
    BinaryTree binaryTree;

    public LeftAndRightView() {
        binaryTree = new BinaryTree();
    }

    public void printLeftView(Node root) {
        List<Node> list = new ArrayList<>();

        printLeftViewUtil(root, list, 0);

        for(Node curr : list) {
            System.out.println(curr.data);
        }
    }

    public void printLeftViewUtil(Node root, List<Node> list, int level) {
        if(root == null) {
            return;
        }

        if(list.get(level) == null) {
            list.set(level, root);
        }

        printLeftViewUtil(root.left, list, level + 1);
        printLeftViewUtil(root.right, list, level + 1);
    }

    public void printRightView(Node root) {
        List<Node> list = new ArrayList<>();

        printLeftViewUtil(root, list, 0);

        for(Node curr : list) {
            System.out.println(curr.data);
        }
    }

    public void printRightViewUtil(Node root, List<Node> list, int level) {
        if(root == null) {
            return;
        }

        list.set(level, root);

        printLeftViewUtil(root.left, list, level + 1);
        printLeftViewUtil(root.right, list, level + 1);
    }

    public static void main(String[] args) {

    }
}
