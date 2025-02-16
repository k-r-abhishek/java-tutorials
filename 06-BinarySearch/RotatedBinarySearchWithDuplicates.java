public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 4, 2, 2};
        int target = 3;
        
        // Calling search function to find the index of target in rotated array
        int result = search(arr, target);
        
        System.out.println("Target found at index: " + result);
    }

    // Function to search for a target element in a rotated sorted array with duplicates
    static int search(int[] nums, int target) {
        // Step 1: Find the pivot (index where rotation occurs)
        int pivot = findPivotWithDuplicates(nums);

        // Step 2: If no pivot is found, the array is not rotated, perform simple binary search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Step 3: If the pivot itself is the target, return the pivot index
        if (nums[pivot] == target) {
            return pivot;
        }

        // Step 4: Determine which side to search based on target's relation to nums[0]
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1); // Search in left half
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1); // Search in right half
    }

    // Standard Binary Search Algorithm
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the middle element is the target, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, search in the right half
            if (arr[mid] < target) {
                start = mid + 1;
            } 
            // If target is smaller, search in the left half
            else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Function to find the pivot index in a rotated sorted array with duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: If mid is greater than the next element, mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: If mid is smaller than the previous element, mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Handling duplicate elements
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Check if start is the pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is the pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Case 4: Left side is sorted, so pivot must be in right half
            else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            // Case 5: Right side is sorted, so pivot must be in left half
            else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found, array is not rotated
    }
}