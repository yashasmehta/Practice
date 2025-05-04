package dsa.binarytree;

public class DiameterOfBinaryTree {
    int ans = 0; // this is the diameter
    public int height(Node root) {
        if(root ==  null) {
            return 0;
        }

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        ans = Math.max(ans, 1 + lHeight + rHeight); // brings down complexity from O(N * N) to O(N).
        return Math.max(lHeight, rHeight) + 1;
    }
}
