package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0144_binary_tree_preorder_traversal {
    List<Integer> list;

    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        dfs(root);
        return list;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        list.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
