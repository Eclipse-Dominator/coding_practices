package Leetcode;

public class Prob7_reverse_integer {
    public int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x *= -1;
        }
        int val = 0, prev;
        while (x > 0) {
            prev = val;
            val = val * 10 + x % 10;
            if ((val - x % 10) / 10 != prev) {
                return 0;
            }
            x /= 10;
        }
        return val * sign;

    }
}
