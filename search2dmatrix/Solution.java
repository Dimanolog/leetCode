package search2dmatrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int max = matrix.length - 1;
        int mid = 0;
        while (low <= max) {
            mid = low + ((max - low) / 2);

            if (matrix[mid][0] < target) {
                low = ++mid;
            } else if (matrix[mid][0] > target) {

                max = --mid;
            } else if (matrix[mid][0] == target) {
                return true;
            }
        }

        int[] rowArray = matrix[mid];
        low = 0;
        max = rowArray.length - 1;

        while (low <= max) {
            mid = low + ((max - low) / 2);

            if (rowArray[mid] < target) {
                low = mid + 1;
            } else if (rowArray[mid] > target) {
                max = mid - 1;
            } else if (rowArray[mid] == target) {
                return true;
            }
        }

        return false;
    }


}
