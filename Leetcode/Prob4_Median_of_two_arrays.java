package Leetcode;

public class Prob4_Median_of_two_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 0) { // no center
            int target = (nums1.length + nums2.length) / 2;
            return ((double) binsearchPos2Array(nums1, nums2, target) + binsearchPos2Array(nums1, nums2, target - 1))
                    / 2;
        } else {
            int target = (nums1.length + nums2.length) / 2;
            return binsearchPos2Array(nums1, nums2, target);
        }
    }

    private int binsearchPos2Array(int[] arr1, int[] arr2, int target) {
        int upperbound1 = arr1.length - 1, upperbound2 = arr2.length - 1, lowerbound1 = 0, lowerbound2 = 0;
        int pos, mid;
        while (lowerbound1 <= upperbound1 || lowerbound2 <= upperbound2) {
            if (upperbound1 - lowerbound1 >= upperbound2 - lowerbound2) {
                mid = lowerbound1 + (upperbound1 - lowerbound1) / 2;
                pos = binsearchPos(arr2, arr1[mid], lowerbound2, upperbound2);
                if (pos + mid == target)
                    return arr1[mid];
                if (pos + mid > target) {
                    upperbound1 = mid - 1;
                    upperbound2 = Math.min(pos, upperbound2);
                } else {
                    lowerbound1 = mid + 1;
                    lowerbound2 = Math.max(pos, lowerbound2);
                }
            } else {
                mid = lowerbound2 + (upperbound2 - lowerbound2) / 2;
                pos = binsearchPos(arr1, arr2[mid], lowerbound1, upperbound1);
                if (pos + mid == target)
                    return arr2[mid];
                if (pos + mid > target) {
                    upperbound2 = mid - 1;
                    upperbound1 = Math.min(pos, upperbound1);
                } else {
                    lowerbound2 = mid + 1;
                    lowerbound1 = Math.max(pos, lowerbound1);
                }
            }
        }
        return -1;
    }

    private int binsearchPos(int[] arr, int target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}
