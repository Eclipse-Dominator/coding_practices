package Leetcode;

public class Prob88_merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, currIndex = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0)
                nums1[currIndex--] = nums2[j--];
            else if (j < 0)
                return;
            else if (nums1[i] > nums2[j])
                nums1[currIndex--] = nums1[i--];
            else
                nums1[currIndex--] = nums2[j--];
        }
    }
}
