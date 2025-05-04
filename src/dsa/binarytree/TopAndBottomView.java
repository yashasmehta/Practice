package dsa.binarytree;

import java.util.*;

public class TopAndBottomView {
    BinaryTree binaryTree;

    public TopAndBottomView() {
        binaryTree = new BinaryTree();
    }

    public List<Integer> topView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));

        // level order traversal
        while(!q.isEmpty()) {
            Pair curr = q.poll();

            if(!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            if(curr.node.left != null) {
                q.add(new Pair(curr.hd - 1, curr.node.left));
            }

            if(curr.node.right != null) {
                q.add(new Pair(curr.hd - 1, curr.node.right));
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    public List<Integer> bottomView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));

        // level order traversal
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            map.put(curr.hd, curr.node.data);

            if(curr.node.left != null) {
                q.add(new Pair(curr.hd - 1, curr.node.left));
            }

            if(curr.node.right != null) {
                q.add(new Pair(curr.hd - 1, curr.node.right));
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    public void verticalTraversal(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));

        // level order traversal
        while(!q.isEmpty()) {
            Pair curr = q.poll();

            if(map.containsKey(curr.hd)) {
                map.get(curr.hd).add(curr.node.data);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(curr.node.data);
                map.put(curr.hd, list);
            }

            if(curr.node.left != null) {
                q.add(new Pair(curr.hd - 1, curr.node.left));
            }

            if(curr.node.right != null) {
                q.add(new Pair(curr.hd + 1, curr.node.right));
            }
        }

        map.forEach(
                (key, value) -> value.stream().peek(System.out::println)
        );
    }
}

class Pair {
    int hd;
    Node node;

    public Pair(int hd, Node node) {
        this.hd = hd;
        this.node = node;
    }
}
