package Leetcode;

public class Prob0542_01_matrix {
    public int[][] updateMatrix(int[][] mat) { // dp
        // credit to
        // https://leetcode.com/problems/01-matrix/discuss/1369741/C%2B%2BJavaPython-BFS-DP-solutions-with-Picture-Clean-and-Concise-O(1)-Space

        int m = mat.length, n = mat[0].length, INF = m + n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    continue;
                mat[i][j] = Math.min((i == 0) ? INF : mat[i - 1][j], (j == 0) ? INF : mat[i][j - 1]) + 1;
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 0)
                    continue;
                mat[i][j] = Math.min(mat[i][j],
                        Math.min((i == m - 1) ? INF : mat[i + 1][j], (j == n - 1) ? INF : mat[i][j + 1]) + 1);
            }
        }
        return mat;
    }
    // bfs
    /*
     * public int[][] updateMatrix(int[][] mat) {
     * Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
     * for (int i = 0; i < mat.length; i++) {
     * for (int j = 0; j < mat[0].length; j++) {
     * if (mat[i][j] == 0)
     * queue.add(List.of(i, j));
     * else
     * mat[i][j] = -1;
     * }
     * }
     * 
     * while (!queue.isEmpty()) {
     * List<Integer> temp = queue.poll();
     * int i = temp.get(0);
     * int j = temp.get(1);
     * int newVal = mat[i][j] + 1;
     * if (i > 0 && mat[i - 1][j] == -1) {
     * mat[i - 1][j] = newVal;
     * queue.add(List.of(i - 1, j));
     * }
     * if (j > 0 && mat[i][j - 1] == -1) {
     * mat[i][j - 1] = newVal;
     * queue.add(List.of(i, j - 1));
     * }
     * if (i < mat.length - 1 && mat[i + 1][j] == -1) {
     * mat[i + 1][j] = newVal;
     * queue.add(List.of(i + 1, j));
     * }
     * if (j < mat[0].length - 1 && mat[i][j + 1] == -1) {
     * mat[i][j + 1] = newVal;
     * queue.add(List.of(i, j + 1));
     * }
     * }
     * return mat;
     * }
     */
    // dfs shouldnt rlly work here imo
    /*
     * public int[][] updateMatrix(int[][] mat) {
     * for (int i = 0; i < mat.length; i++) {
     * for (int j = 0; j < mat[0].length; j++) {
     * if (mat[i][j] == 0)
     * dfs(mat, i, j);
     * }
     * }
     * 
     * for (int i = 0; i < mat.length; i++) {
     * for (int j = 0; j < mat[0].length; j++) {
     * if (mat[i][j] != 0)
     * mat[i][j] -= 1;
     * }
     * }
     * 
     * return mat;
     * }
     * 
     * 
     * private void dfs(int[][] mat, int i, int j) { // source
     * dfs(mat, i + 1, j, 1);
     * dfs(mat, i - 1, j, 1);
     * dfs(mat, i, j + 1, 1);
     * dfs(mat, i, j - 1, 1);
     * }
     * 
     * private void dfs(int[][] mat, int i, int j, int timestamp) {
     * if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] ==
     * 0)
     * return;
     * 
     * if (mat[i][j] > timestamp + 1 || mat[i][j] == 1)
     * mat[i][j] = timestamp + 1;
     * else
     * return;
     * 
     * dfs(mat, i + 1, j, timestamp + 1);
     * dfs(mat, i - 1, j, timestamp + 1);
     * dfs(mat, i, j + 1, timestamp + 1);
     * dfs(mat, i, j - 1, timestamp + 1);
     * }
     */
}
