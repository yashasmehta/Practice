package dsa.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    BinaryTree binaryTree;

    LevelOrderTraversal() {
        binaryTree = new BinaryTree();
    }

    public void levelOrder(Node root) {
        int height = binaryTree.height(root);

        for(int i=1;i<=height;i++) {
            printCurrentLevel(root, i);
        }
    }

    public void printCurrentLevel(Node root, int level) {
        if(root == null) {
            return;
        }

        if(level == 1) {
            System.out.println(root.data);
        } else if(level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public void levelOrderOptimized(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.println(curr.data);

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public void levelOrderOptimizedAndPrintLevelInNextLine(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            Node curr = queue.poll();

            if(curr == null) {
                if(queue.isEmpty()) {
                    return;
                }

                queue.add(null);
                System.out.println();
                continue;
            }

            System.out.println(curr.data);

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        Node root = levelOrderTraversal.binaryTree.createTree();
        levelOrderTraversal.levelOrder(root);
    }
}
