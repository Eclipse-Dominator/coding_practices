package Leetcode;

public class Prob110_balanced_binary_tree {
    boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        balanced = true;
        recurseHeight(root);
        return balanced;
    }

    public int recurseHeight(TreeNode node) {
        if (!balanced)
            return -2;
        if (node == null)
            return 0;
        int l = recurseHeight(node.left), r = recurseHeight(node.right);
        if (Math.abs(l - r) > 1) {
            balanced = false;
            return -2;
        }

        return 1 + Math.max(l, r);
    }
}
