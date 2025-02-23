import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        // Initialize the array to be sorted
        int[] arr = {5, 3, 4, 1, 2};

        // Call the selection sort method to sort the array
        selection(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Selection Sort Method
    static void selection(int[] arr) {
        // Outer loop: Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // The index of the last unsorted element
            int last = arr.length - i - 1;

            // Find the index of the maximum element in the unsorted portion of the array
            int maxIndex = getMaxIndex(arr, 0, last);

            // Swap the maximum element found with the last unsorted element
            swap(arr, maxIndex, last);
        }
    }

    // Swap Method: Swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        // Temporary variable to hold the value of arr[first]
        int temp = arr[first];

        // Swap the elements at 'first' and 'second' indices
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Method to get the index of the maximum element in a specified range
    static int getMaxIndex(int[] arr, int start, int end) {
        // Assume the first element in the range as the maximum
        int max = start;

        // Loop through the specified range to find the maximum element
        for (int i = start; i <= end; i++) {
            // If the current element is greater than the element at 'max', update 'max'
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        // Return the index of the maximum element found in the range
        return max;
    }
}