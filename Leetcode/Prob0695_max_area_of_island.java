package Leetcode;

public class Prob0695_max_area_of_island {
    public int maxAreaOfIsland(int[][] grid) {
        // to denote visited, mark grid[i][j] as 0
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxArea = Math.max(dfs(grid, i, j), maxArea);
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (!isValid(grid, i, j))
            return 0;
        if (grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        return 1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j + 1) + dfs(grid, i, j - 1);
    }

    private boolean isValid(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length)
            return false;
        if (j < 0 || j >= grid[0].length)
            return false;
        return true;
    }
}
