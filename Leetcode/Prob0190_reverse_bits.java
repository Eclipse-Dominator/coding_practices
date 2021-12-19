package Leetcode;

public class Prob0190_reverse_bits {
    public int reverseBits(int n) {
        int zeros = 32;
        int ret = 0;
        while (n != 0) {
            ret = ret << 1;
            ret += n & 1;
            n = n >>> 1;
            zeros--;
        }
        ret <<= zeros;
        return ret;
    }

    public int reverseBits2(int n) {
        n = n >>> 0x10 | n << 0x10; // ABCD EFGH -> EFGH ABCD
        // 1234 5678
        n = (n & 0xff00ff00) >>> 8 | (n & 0x00ff00ff) << 8; // AB CD -> CD AB
        n = (n & 0xf0f0f0f0) >>> 4 | (n & 0x0f0f0f0f) << 4; // A B -> B A
        n = (n & 0xcccccccc) >>> 2 | (n & 0x33333333) << 2; // ab cd -> cd ab
        n = (n & 0xaaaaaaaa) >>> 1 | (n & 0x55555555) << 1; // a b -> b a
        return n;
    }
}
