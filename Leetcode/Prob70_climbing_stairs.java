package Leetcode;

public class Prob70_climbing_stairs {
    // step to climb n is ways to reach n-1 + ways to reach n-2
    public int climbStairs(int n) {
        // O(n) space and time
        // int[] arr = new int[n + 2];
        // arr[0] = 1;
        // arr[1] = 2;
        // for (int i = 2; i < n; i++) {
        // arr[i] = arr[i - 1] + arr[i - 2];
        // }
        // return arr[n - 1];
        // O(n) time, O(1) space
        if (n <= 2)
            return n;
        int a = 1, b = 2, tmp = 0;
        for (int i = 2; i < n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
}
