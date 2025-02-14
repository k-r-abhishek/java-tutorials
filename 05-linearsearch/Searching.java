import java.util.*;

public class Searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60}; // Given array
        int target = 30; // Element to search
        
        int index = linearSearch(arr, target);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
        input.close();
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found, return index
            }
        }
        return -1; // Not found
    }
}
