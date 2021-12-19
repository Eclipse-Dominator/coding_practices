package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Prob0111_miniumum_depth_of_binary_tree {
    public int minDepth(TreeNode root) { // bfs
        if (root == null)
            return 0;
        root.val = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null)
                return node.val;
            if (node.left != null) {
                queue.add(node.left);
                node.left.val = node.val + 1;
            }
            if (node.right != null) {
                queue.add(node.right);
                node.right.val = node.val + 1;
            }
        }
        return 0;
    }
}
