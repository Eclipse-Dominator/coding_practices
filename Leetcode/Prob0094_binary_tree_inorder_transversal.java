package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Prob0094_binary_tree_inorder_transversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        transverse(root, list);
        return list;
    }

    public void transverse(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        transverse(node.left, list);
        list.add(node.val);
        transverse(node.right, list);
    }
}
