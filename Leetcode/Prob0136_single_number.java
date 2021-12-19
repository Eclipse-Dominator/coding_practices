package Leetcode;

public class Prob0136_single_number {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int i : nums) {
            ret = ret ^ i;
        }
        return ret;
    }
}
