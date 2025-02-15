public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // Finds the greatest number in the array that is smaller than or equal to the target
    static int floor(int[] arr, int target) {
        if (target < arr[0]) {
            return -1; // No floor exists if the target is smaller than the smallest element
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Exact match found
            }
        }
        return end; // The greatest number <= target
    }
}