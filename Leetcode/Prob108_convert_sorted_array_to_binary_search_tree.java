package Leetcode;

public class Prob108_convert_sorted_array_to_binary_search_tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        // binsearch for head;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int s, int e) {
        if (s > e)
            return null;
        int mid = s + (e - s) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, s, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, e);
        return root;
    }

}
