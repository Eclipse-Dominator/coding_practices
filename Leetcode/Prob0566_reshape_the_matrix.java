package Leetcode;

public class Prob0566_reshape_the_matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length)
            return mat;
        int[][] ret = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ret[i][j] = getVal(mat, i, j, c);
            }
        }
        return ret;
    }

    private int getVal(int[][] arr, int i, int j, int rSize) {
        int width = arr[0].length;
        int cummIndex = i * rSize + j;
        return arr[cummIndex / width][cummIndex % width];
    }
}
