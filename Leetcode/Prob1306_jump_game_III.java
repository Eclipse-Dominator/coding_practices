package Leetcode;

public class Prob1306_jump_game_III {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return canReach(arr, visited, start);
    }

    private boolean canReach(int[] arr, boolean[] visited, int i) {
        if (i < 0)
            return false;
        if (i >= arr.length)
            return false;
        if (arr[i] == 0)
            return true;
        if (visited[i])
            return false;
        visited[i] = true;
        return canReach(arr, visited, i + arr[i]) || canReach(arr, visited, i - arr[i]);
    }
}
