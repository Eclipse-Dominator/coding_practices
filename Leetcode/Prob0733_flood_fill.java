package Leetcode;

public class Prob0733_flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        floodFill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    private void floodFill(int[][] image, int sr, int sc, int newColor, int oldColor) {
        if (!isValid(image, sr, sc))
            return;
        if (image[sr][sc] != oldColor || image[sr][sc] == newColor)
            return;
        image[sr][sc] = newColor;
        floodFill(image, sr + 1, sc, newColor, oldColor);
        floodFill(image, sr - 1, sc, newColor, oldColor);
        floodFill(image, sr, sc + 1, newColor, oldColor);
        floodFill(image, sr, sc - 1, newColor, oldColor);
    }

    private boolean isValid(int[][] image, int y, int x) {
        if (y < 0 || y >= image.length)
            return false;
        if (x < 0 || x >= image[0].length)
            return false;
        return true;
    }
}
