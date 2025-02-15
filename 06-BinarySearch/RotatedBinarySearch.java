public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot, array is not rotated, do normal binary search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is at the pivot index
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target lies in the left sorted part
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Otherwise, search in the right sorted part
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            if (arr[mid] >= arr[start]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}