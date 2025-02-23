import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};  // Array to be sorted
        
        // Bubble Sort
        int[] bubbleSortedArr = arr.clone();  // Clone the original array for Bubble Sort
        bubbleSort(bubbleSortedArr);
        System.out.println("Bubble Sort Output: " + Arrays.toString(bubbleSortedArr));
        
        // Selection Sort
        int[] selectionSortedArr = arr.clone();  // Clone the original array for Selection Sort
        selectionSort(selectionSortedArr);
        System.out.println("Selection Sort Output: " + Arrays.toString(selectionSortedArr));
        
        // Insertion Sort
        int[] insertionSortedArr = arr.clone();  // Clone the original array for Insertion Sort
        insertionSort(insertionSortedArr);
        System.out.println("Insertion Sort Output: " + Arrays.toString(insertionSortedArr));
    }

    // Bubble Sort Method
    static void bubbleSort(int[] arr) {
        boolean swapped;  // Flag to check if a swap happened during each pass
        
        for (int i = 0; i < arr.length; i++) {
            swapped = false;  // Reset the swapped flag for each pass
            
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {  // If the current element is smaller, swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            
            // Exit early if no swaps were made in this pass
            if (!swapped) {
                break;
            }
        }
    }

    // Selection Sort Method
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    // Method to get the index of the maximum element in a specified range
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Insertion Sort Method
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // Swap Method: Swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}