package Leetcode;

public class Prob997_squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums) {
        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] *= nums[i];
            }
            return nums;
        }

        int[] tmpArr = new int[nums.length];
        int j = findFirstPos(nums);
        int i = j - 1;
        int currIndex = 0;
        while (i >= 0 || j < nums.length) {
            if (j >= nums.length)
                tmpArr[currIndex++] = nums[i] * nums[i--];
            else if (i < 0)
                tmpArr[currIndex++] = nums[j] * nums[j++];
            else if (nums[i] * -1 < nums[j])
                tmpArr[currIndex++] = nums[i] * nums[i--];
            else
                tmpArr[currIndex++] = nums[j] * nums[j++];
        }

        return tmpArr;
    }

    private int findFirstPos(int[] arr) { // log n
        int s = 0, e = arr.length - 1, mid;
        while (s < e) {
            mid = s + (e - s) / 2;
            if (arr[mid] >= 0) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return e;
    }
}
