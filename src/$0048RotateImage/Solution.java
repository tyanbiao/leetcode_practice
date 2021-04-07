package $0048RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) rotate(matrix, i, j, n);
        }
    }

    private void rotate(int[][] matrix, int i, int j, int n) {
        int t = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = matrix[i][j];
        matrix[i][j] = matrix[n - i - 1][n - j - 1];
        matrix[n - i - 1][n - j - 1] = t;
        t = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[i][j];
        matrix[i][j] = t;
    }
}
