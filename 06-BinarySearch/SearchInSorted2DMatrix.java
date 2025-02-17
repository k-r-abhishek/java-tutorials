import java.util.Arrays;

public class SearchInSorted2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // Perform binary search in a single row between specified columns
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid}; // Found target
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1; // Move right
            } else {
                cEnd = mid - 1; // Move left
            }
        }
        return new int[]{-1, -1}; // Target not found
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Check matrix is not empty
        if (cols == 0) {
            return new int[]{-1, -1}; // Edge case: Empty matrix
        }
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target); // Single row case
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2; // Middle column index

        // Reduce search space to two rows
        while (rStart < (rEnd - 1)) { // Loop until only two rows remain
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid}; // Found target in middle column
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid; // Search in lower half
            } else {
                rEnd = mid; // Search in upper half
            }
        }

        // Now, we have two rows remaining. Check the middle column
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Now search in four possible quadrants
        // 1st half (Top-left)
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // 2nd half (Top-right)
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // 3rd half (Bottom-left)
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // 4th half (Bottom-right)
        return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    }
}