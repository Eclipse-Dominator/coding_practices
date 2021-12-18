package Leetcode;

public class Prob0994_rotting_oranges {
    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    expandRotting(grid, i, j);
            }
        }

        int minElapsed = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                minElapsed = Math.max(grid[i][j], minElapsed);
                if (grid[i][j] == 1)
                    return -1;
            }
        }
        return Math.max(minElapsed - 2, 0);
    }

    private void expandRotting(int[][] grid, int i, int j) { // source
        if (i < grid.length - 1) {
            expandRotting(grid, i + 1, j, 1);
        }
        if (i > 0) {
            expandRotting(grid, i - 1, j, 1);
        }
        if (j > 0) {
            expandRotting(grid, i, j - 1, 1);
        }
        if (j < grid[0].length - 1) {
            expandRotting(grid, i, j + 1, 1);
        }
    }

    private void expandRotting(int[][] grid, int i, int j, int timestamp) {
        if (grid[i][j] == 1 || grid[i][j] > timestamp + 2)
            grid[i][j] = timestamp + 2;
        else
            return;
        if (i < grid.length - 1) {
            expandRotting(grid, i + 1, j, timestamp + 1);
        }
        if (i > 0) {
            expandRotting(grid, i - 1, j, timestamp + 1);
        }
        if (j > 0) {
            expandRotting(grid, i, j - 1, timestamp + 1);
        }
        if (j < grid[0].length - 1) {
            expandRotting(grid, i, j + 1, timestamp + 1);
        }
    }
}
