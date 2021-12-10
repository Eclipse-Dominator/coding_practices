package Leetcode;

import java.util.Arrays;

public class Prob0036_valid_sudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int i, int j) {
        if (board[i][j] == '.')
            return true;
        int[] valid = new int[9];
        for (char c : board[i])
            if (c != '.') {
                valid[c - '0' - 1] += 1;
                if (valid[c - '0' - 1] > 1)
                    return false;
            }
        Arrays.fill(valid, 0);
        for (int in = 0; in < 9; in++) {
            if (board[in][j] != '.') {
                valid[board[in][j] - '0' - 1] += 1;
                if (valid[board[in][j] - '0' - 1] > 1)
                    return false;
            }
        }
        Arrays.fill(valid, 0);
        for (int r = 0; r < 3; r++) {
            for (int l = 0; l < 3; l++) {
                int row = r + 3 * (i / 3);
                int col = l + 3 * (j / 3);
                if (board[row][col] != '.') {
                    valid[board[row][col] - '0' - 1] += 1;
                    if (valid[board[row][col] - '0' - 1] > 1)
                        return false;
                }
            }
        }
        return true;
    }
}
