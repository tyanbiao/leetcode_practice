package $0074SearchA2DMatrix;

import edu.princeton.cs.algs4.StdOut;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = searchRow(matrix, target);
        return row >= 0 && searchColumn(matrix[row], target) >= 0;
    }
    public int searchRow(int[][] matrix, int target) {
        int rowL = 0, rowH = matrix.length - 1;
        while (rowL <= rowH) {
            int rowM = rowL + (rowH - rowL) / 2;
            if (matrix[rowM][0] > target) {
                rowH = rowM - 1;
            } else if (matrix[rowM][matrix[rowM].length - 1] < target) {
                rowL = rowM + 1;
            } else {
                return rowM;
            }
        }
        return -1;
    }

    public int searchColumn(int[] row, int target) {
        int l = 0, h = row.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (row[mid] > target) {
                h = mid - 1;
            } else if (row[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        StdOut.println(new Solution().searchMatrix(matrix, 2));
    }
}
