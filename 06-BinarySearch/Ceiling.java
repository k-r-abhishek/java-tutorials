public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // Finds the smallest number in the array that is greater than or equal to the target
    static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1; // No ceiling exists if the target is greater than the largest element
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
        return start; // The smallest number >= target
    }
}