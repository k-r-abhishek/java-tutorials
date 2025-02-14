import java.util.*;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {5, 12, 18, 25, 30, 40, 50}; 
        int target = 30; // Element to search
        int start = 2, end = 5; // Range: Index 2 to 5
        
        int index = searchInRange(arr, target, start, end);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the given range.");
        }
        input.close();
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
