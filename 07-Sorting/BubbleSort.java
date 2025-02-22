import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};  // Array to be sorted
        bubbleSort(arr);  // Call the bubbleSort method to sort the array
        System.out.println(Arrays.toString(arr));  // Print the sorted array
    }

    // Bubble Sort Method
    static void bubbleSort(int[] arr) {
        boolean swapped;  // Flag to check if a swap happened during each pass
        
        // Outer loop: Run n-1 times (n is the length of the array)
        for (int i = 0; i < arr.length; i++) {
            swapped = false;  // Reset the swapped flag for each pass
            
            // Inner loop: Compare adjacent elements and swap if necessary
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {  // If the current element is smaller, swap
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            // Exit early if no swaps were made in this pass
            if (!swapped) {
                break;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
