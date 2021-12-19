package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Prob0653_two_sum_iv_input_is_a_bst {
    Map<Integer, Integer> map;

    public boolean findTarget(TreeNode root, int k) {
        map = new HashMap<>();
        dfs(root);
        for (int i : map.keySet()) {
            map.compute(i, (key, v) -> v - 1);
            if (map.containsKey(k - i) && map.get(k - i) > 0)
                return true;
            map.compute(i, (key, v) -> v + 1);
        }
        return false;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        dfs(node.left);
        dfs(node.right);
    }
}
