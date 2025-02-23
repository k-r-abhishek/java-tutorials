import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        // Example array to demonstrate Cyclic Sort
        int[] arr = {3, 5, 2, 1, 4};
        
        // Sorting the array using Cyclic Sort
        sort(arr);
        
        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Function to perform Cyclic Sort
    static void sort(int[] arr) {
        int i = 0;

        // Loop through the array
        while (i < arr.length) {
            // Correct index where arr[i] should be placed
            int correct = arr[i] - 1;

            // If the current element is not in its correct position, swap it
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                // If the element is already at the correct position, move to the next index
                i++;
            }
        }
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];  // Store the first value temporarily
        arr[first] = arr[second]; // Assign second value to first index
        arr[second] = temp; // Assign temp (first value) to second index
    }
}