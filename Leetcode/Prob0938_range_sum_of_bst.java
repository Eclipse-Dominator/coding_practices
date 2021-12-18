package Leetcode;

public class Prob0938_range_sum_of_bst {
    private int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;
    }

    private void dfs(TreeNode node, int low, int high) {
        if (node == null)
            return;
        if (node.val < low)
            dfs(node.right, low, high);
        else if (node.val > high)
            dfs(node.left, low, high);
        else {
            sum += node.val;
            dfs(node.right, low, high);
            dfs(node.left, low, high);
        }

    }
}
