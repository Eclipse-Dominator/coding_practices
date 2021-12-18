package Leetcode;

public class Prob0617_merge_two_binary_trees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        dfs(root1, root2);
        return root1;
    }

    private void dfs(TreeNode node1, TreeNode node2) { // preorder transversal
        if (node2 == null)
            return;
        node1.val += node2.val;
        if (node1.left == null)
            node1.left = node2.left;
        else
            dfs(node1.left, node2.left);
        if (node1.right == null)
            node1.right = node2.right;
        else
            dfs(node1.right, node2.right);
    }
}
