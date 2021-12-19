package Leetcode;

public class Prob0098_validate_binary_search_tree {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer min, Integer max) {
        if (node == null)
            return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max))
            return false;
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
