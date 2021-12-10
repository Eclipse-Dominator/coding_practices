package Leetcode;

public class Prob69_sqrtx {
    public int mySqrt(int x) {
        int s = 0, e = x / 2 + 1;
        int mid;
        while (s <= e) {
            mid = s + (e - s) / 2;
            long midSq = (long) mid * mid;
            if (midSq == x)
                return mid;
            if (midSq > x)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return e;
    }

    public int newtonSqrt(int x) {
        long ret = x;
        while (ret * ret > x) {
            ret = (ret + x / ret) / 2;
        }
        return (int) ret;
    }

}
