package Leetcode;

public class Prob167_two_sum_ii_input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        int pt1 = 0, pt2 = numbers.length - 1;
        while (numbers[pt1] + numbers[pt2] != target) { // a sol always exist
            if (numbers[pt1] + numbers[pt2] > target)
                pt2--;
            else
                pt1++;
        }
        return new int[] { pt1 + 1, pt2 + 1 };
    }
}
