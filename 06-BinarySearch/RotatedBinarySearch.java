public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        // Search for the target in the rotated sorted array
        System.out.println(search(arr, target));
    }

    // Function to search for a target element in a rotated sorted array
    static int search(int[] nums, int target) {
        // Step 1: Find the pivot index (where the rotation occurs)
        int pivot = findPivot(nums);

        // Step 2: If no pivot is found, the array is not rotated, perform normal binary search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Step 3: If the target is at the pivot index, return its position
        if (nums[pivot] == target) {
            return pivot;
        }

        // Step 4: Determine which half to search
        // If the target is greater than or equal to the first element, search in the left part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Otherwise, search in the right part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // Standard Binary Search Algorithm
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the middle element is the target, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, move to the right half
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // If target is smaller, move to the left half
            else {
                end = mid - 1;
            }
        }
        return -1; // Target not found
    }

    // Function to find the pivot index (rotation point) in a rotated sorted array
    static int findPivot(int[] arr) {
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

            // Case 3: If left part is sorted, pivot must be in right half
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            // Case 4: If right part is sorted, pivot must be in left half
            else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found, array is not rotated
    }
}
