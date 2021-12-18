package Leetcode;

public class Prob0191_number_of_1_bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            ret += n & 1;
            n = n >>> 1;
        }
        return ret;
    }
}
