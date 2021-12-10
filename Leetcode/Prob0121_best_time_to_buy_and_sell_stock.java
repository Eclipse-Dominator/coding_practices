package Leetcode;

public class Prob0121_best_time_to_buy_and_sell_stock {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i : prices) {
            min = Math.min(min, i);
            max = Math.max(max, i - min);
        }
        return max;
    }
    /*
     * private int maxProfit(int[] prices, int s, int e) {
     * System.out.printf("%d, %d%n", s, e);
     * if (s >= e)
     * return 0;
     * if (s == e - 1) {
     * return prices[s] - prices[e];
     * }
     * int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
     * int middle = s + (e - s) / 2;
     * for (int i = s; i < middle; i++)
     * min = Math.min(min, prices[i]);
     * for (int i = middle; i <= e; i++)
     * max = Math.max(max, prices[i]);
     * return Math.max(max - min, Math.max(maxProfit(prices, s, middle - 1),
     * maxProfit(prices, middle, e)));
     * }
     */
}
