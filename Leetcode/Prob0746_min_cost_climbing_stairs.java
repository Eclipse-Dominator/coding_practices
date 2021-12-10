package Leetcode;

//import java.util.Arrays;

public class Prob0746_min_cost_climbing_stairs {
    // O(1) time dp
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0], b = cost[1], tmp;
        for (int i = 2; i < cost.length; i++) {
            tmp = Math.min(a, b) + cost[i];
            a = b;
            b = tmp;
        }
        return Math.min(a, b);
    }

    // iterative dp
    // public int minCostClimbingStairs(int[] cost) {
    // int len = cost.length;
    // int[] arr = new int[len];
    // arr[0] = cost[0];
    // arr[1] = cost[1];
    // for (int i = 2; i < len; i++) {
    // arr[i] = Math.min(arr[i - 1], arr[i - 2]) + cost[i];
    // }
    // return Math.min(arr[len - 1], arr[len - 2]);
    // }
    // recursive memoized sol
    /*
     * public int minCostClimbingStairs(int[] cost) { int[] dp = new int[cost.length
     * + 1]; Arrays.fill(dp, -1); return findMinCost(cost.length, dp, cost); }
     * 
     * private int findMinCost(int n, int[] dp, int[] cost) { if (dp[n] != -1)
     * return dp[n]; if (n <= 1) { // reachable in 1 step dp[n] = cost[n]; return
     * dp[n]; } int totalCost = (n == cost.length) ? 0 : cost[n]; dp[n] = totalCost
     * + Math.min(findMinCost(n - 1, dp, cost), findMinCost(n - 2, dp, cost));
     * return dp[n]; }
     */
}
