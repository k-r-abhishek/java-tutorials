import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int[] arr = {5, 3, 4, 1, 2};

        // Call the selection sort method to sort the array
        insertion(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
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
}