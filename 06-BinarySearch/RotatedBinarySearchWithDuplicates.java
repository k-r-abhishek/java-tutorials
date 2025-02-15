public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 4, 2, 2};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

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

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            // Handling duplicates: If start, mid, and end are equal, shrink search space
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;
                if (end > start && arr[end] < arr[end - 1]) return end - 1;
                end--;
            } else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}