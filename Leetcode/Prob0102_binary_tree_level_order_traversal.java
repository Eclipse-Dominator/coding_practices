package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Prob0102_binary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null)
            return ret;
        List<Integer> tmp;
        List<TreeNode> next = List.of(root);
        List<TreeNode> tmpNext = List.of(root);

        while (!next.isEmpty()) {
            tmp = new ArrayList<>();
            tmpNext = new ArrayList<>();
            for (TreeNode node : next) {
                if (node != null) {
                    tmp.add(node.val);
                    tmpNext.add(node.left);
                    tmpNext.add(node.right);
                }
            }
            if (tmp.size() == 0)
                break;
            else
                ret.add(tmp);
            next = tmpNext;
        }
        return ret;
    }
}
