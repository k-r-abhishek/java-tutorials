import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int target = 5; // Element to search
        int[] result = searchIn2DArray(arr, target);
        
        if (result[0] != -1) {
            System.out.println("Element found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element not found.");
        }
        input.close();
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // Return row & column index
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    }
}
