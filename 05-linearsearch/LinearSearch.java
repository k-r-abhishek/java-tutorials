import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int target = input.nextInt();

        int index = LinearSearching(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        input.close(); // Closing Scanner (Best practice)
    }

    static int LinearSearching(int[] arr, int target) {
        if (arr.length == 0) return -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
}
