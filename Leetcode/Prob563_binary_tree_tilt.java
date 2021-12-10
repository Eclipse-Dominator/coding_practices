package Leetcode;

public class Prob563_binary_tree_tilt {
    private int totalTilt = 0;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        findSum(root);
        return totalTilt;
    }

    private int findSum(TreeNode node) {
        if (node == null)
            return 0;
        int l = findSum(node.left);
        int r = findSum(node.right);
        totalTilt += Math.abs(l - r);
        return l + r + node.val;
    }
}
