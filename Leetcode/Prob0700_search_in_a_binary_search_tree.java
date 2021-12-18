package Leetcode;

public class Prob0700_search_in_a_binary_search_tree {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val)
                return root;
            if (root.val > val)
                root = root.left;
            else
                root = root.right;
        }
        return root;
    }
}
