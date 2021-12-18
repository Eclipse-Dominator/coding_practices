package Leetcode;

public class Prob0701_insert_into_a_binary_search_tree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else { // guarentted that val inserted is not in the tree;
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
