package Leetcode;

public class Prob0235_lowest_common_ancestor_of_a_binary_search_tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = q;
            q = p;
            p = tmp;
        }
        if (p.val <= root.val && q.val >= root.val)
            return root;
        if (p.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return lowestCommonAncestor(root.left, p, q);
    }
}
