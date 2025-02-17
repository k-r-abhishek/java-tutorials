public class SearchInMountain {
    public static void main(String[] args) {
        // You can add test cases here for debugging
    }

    // Function to search for a target in a mountain array
    int search(int[] arr, int target) {
        // Step 1: Find the peak index in the mountain array
        int peak = peakIndexInMountainArray(arr);

        // Step 2: Try to find the target in the left (ascending) part of the array
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry; // If found, return index immediately
        }

        // Step 3: If not found in the left part, search in the right (descending) part
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Function to find the peak index in a mountain array
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the middle element is greater than the next one, we are in the decreasing part
            if (arr[mid] > arr[mid + 1]) {
                // This mid could be the peak, but we continue checking left
                end = mid;
            } else {
                // We are in the increasing part, so the peak must be on the right
                start = mid + 1;
            }
        }
        // When start == end, it will point to the peak element
        return start;
    }

    // Modified Binary Search that works for both ascending and descending order
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // Determine if the array segment is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Found target, return index
            }

            if (isAsc) { // If sorted in ascending order
                if (target < arr[mid]) {
                    end = mid - 1; // Search left
                } else {
                    start = mid + 1; // Search right
                }
            } else { // If sorted in descending order
                if (target > arr[mid]) {
                    end = mid - 1; // Search left
                } else {
                    start = mid + 1; // Search right
                }
            }
        }
        return -1; // Target not found
    }
}