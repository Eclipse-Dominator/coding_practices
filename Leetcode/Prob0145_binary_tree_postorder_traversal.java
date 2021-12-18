package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0145_binary_tree_postorder_traversal {
    List<Integer> list;

    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        dfs(root);
        return list;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        dfs(node.left);
        dfs(node.right);
        list.add(node.val);
    }
}
