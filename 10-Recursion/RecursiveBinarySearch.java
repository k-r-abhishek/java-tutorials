public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {23, 27, 38, 47, 52, 59, 63, 67, 70, 77, 87, 97};
        int targetValue = 87;

        int resultIndex = binarySearch(sortedArray, targetValue, 0, sortedArray.length - 1);
        System.out.println("Element found at index: " + resultIndex);
    }

    static int binarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1; // Target not found
        }

        int mid = start + (end - start) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (target < array[mid]) {
            return binarySearch(array, target, start, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, end);
        }
    }
}