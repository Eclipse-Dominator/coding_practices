package Leetcode;

public class Prob1559_detect_cycles_in_2d_grid {
    private int gridWidth;
    private int gridHeight;
    private boolean[] visited;

    public boolean containsCycle(char[][] grid) {
        gridHeight = grid.length;
        gridWidth = grid[0].length;
        visited = new boolean[gridWidth * gridHeight];
        for (int i = 0; i < gridHeight; i++) {
            for (int j = 0; j < gridWidth; j++) {
                if (visited[convertToIndex(i, j)])
                    continue;
                if (checkCycles(grid, i, j, convertToIndex(i, j)))
                    return true;
            }
        }
        return false;
    }

    private boolean checkCycles(char[][] grid, int i, int j, int prevIndex) {
        int currIndex = convertToIndex(i, j);
        if (visited[currIndex])
            return true;
        visited[currIndex] = true;

        if (isValid(i + 1, j) && grid[i + 1][j] == grid[i][j] && convertToIndex(i + 1, j) != prevIndex
                && checkCycles(grid, i + 1, j, currIndex)) {
            return true;
        }
        if (isValid(i - 1, j) && grid[i - 1][j] == grid[i][j] && convertToIndex(i - 1, j) != prevIndex
                && checkCycles(grid, i - 1, j, currIndex)) {
            return true;
        }
        if (isValid(i, j + 1) && grid[i][j + 1] == grid[i][j] && convertToIndex(i, j + 1) != prevIndex
                && checkCycles(grid, i, j + 1, currIndex)) {
            return true;
        }
        if (isValid(i, j - 1) && grid[i][j - 1] == grid[i][j] && convertToIndex(i, j - 1) != prevIndex
                && checkCycles(grid, i, j - 1, currIndex)) {
            return true;
        }
        return false;
    }

    private boolean isValid(int i, int j) {
        if (i >= gridHeight || i < 0)
            return false;
        if (j >= gridWidth || j < 0)
            return false;
        return true;
    }

    private int convertToIndex(int i, int j) {
        return i * gridWidth + j;
    }
}
