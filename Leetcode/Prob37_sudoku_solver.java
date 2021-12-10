package Leetcode;

public class Prob37_sudoku_solver {
    boolean solved = false;

    public void solveSudoku(char[][] board) {
        int i, j = 0;
        exit: {
            for (i = 0; i < 9; i++) {
                for (j = 0; j < 9; j++)
                    if (board[i][j] == '.') {
                        int[] options = getValues(board, i, j);
                        for (int k = 0; k < 9; k++) {
                            if (!solved && options[k] == 0) {
                                board[i][j] = (char) (k + 1 + '0');

                                solveSudoku(board);
                            }
                        }
                        break exit;
                    }
            }
            solved = true;
        }

        if (solved != true)
            board[i][j] = '.';
    }

    private int[] getValues(char[][] board, int i, int j) { // i : row, j : col
        int[] invalid = new int[9];
        for (int k = 0; k < 9; k++)
            invalid[k] = 1;
        int[] arr = new int[9];
        int[] validicity = new int[9];
        for (char c : board[i])
            if (c != '.') {
                arr[c - '0' - 1] = 1;
                validicity[c - '0' - 1] += 1;
                if (validicity[c - '0' - 1] > 1)
                    return invalid;
            }
        validicity = new int[9];
        for (int in = 0; in < 9; in++) {
            if (board[in][j] != '.') {
                arr[board[in][j] - '0' - 1] = 1;
                validicity[board[in][j] - '0' - 1] += 1;
                if (validicity[board[in][j] - '0' - 1] > 1)
                    return invalid;
            }
        }
        validicity = new int[9];
        for (int r = 0; r < 3; r++) {
            for (int l = 0; l < 3; l++) {
                int row = r + 3 * (i / 3);
                int col = l + 3 * (j / 3);
                if (board[row][col] != '.') {
                    arr[board[row][col] - '0' - 1] = 1;
                    validicity[board[row][col] - '0' - 1] += 1;
                    if (validicity[board[row][col] - '0' - 1] > 1)
                        return invalid;
                }
            }
        }
        return arr;
    }

}
