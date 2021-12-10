package Leetcode;

public class Prob74_search_a_2d_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h = matrix.length;
        int w = matrix[0].length;
        int s = 0;
        int r = w * h - 1;
        int mid, search;
        while (s <= r) {
            mid = s + (r - s) / 2;
            search = matrix[mid / w][mid % w];
            if (search == target)
                return true;
            if (search > target)
                r = mid - 1;
            else
                s = mid + 1;
        }
        return false;
    }
}
