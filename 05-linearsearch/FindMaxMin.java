import java.util.*;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 45, 2, 98, 23, 78, 5};

        int max = findMax(arr);
        int min = findMin(arr);
        
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        input.close();
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
