import java.util.*;

public class ArrayRevision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Basic Array Declaration and Initialization
        int[] numbers = {23, 45, 233, 543, 3};
        System.out.println("Element at index 3: " + numbers[3]);

        // 2. Array Input
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        // 3. String Array
        String[] strArr = new String[4];
        System.out.println("Enter 4 strings:");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = in.next();
        }
        System.out.println("String Array: " + Arrays.toString(strArr));

        // 4. Passing Array in Functions
        System.out.println("Max value in array: " + findMax(arr));

        // 5. Swapping Elements in an Array
        swap(arr, 0, 4);
        System.out.println("Array after swapping first and last element: " + Arrays.toString(arr));

        // 6. 2D Array
        int[][] matrix = new int[3][3];
        System.out.println("Enter 3x3 matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = in.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // 7. Jagged Array
        int[][] jaggedArr = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("Jagged Array:");
        for (int[] row : jaggedArr) {
            System.out.println(Arrays.toString(row));
        }

        // 8. Array Reversal
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        // 9. Sorting an Array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 10. Searching in Array (Linear Search)
        System.out.println("Enter element to search:");
        int key = in.nextInt();
        int index = linearSearch(arr, key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");

        // 11. Copying an Array
        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArr));

        // 12. Merging Two Arrays
        int[] anotherArr = {100, 200, 300};
        int[] mergedArray = mergeArrays(arr, anotherArr);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        // 13. ArrayList Example
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 elements for ArrayList:");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println("ArrayList: " + list);

        // 14. Removing an Element from ArrayList
        System.out.println("Enter index to remove from ArrayList:");
        int removeIndex = in.nextInt();
        if (removeIndex >= 0 && removeIndex < list.size()) {
            list.remove(removeIndex);
            System.out.println("Updated ArrayList: " + list);
        } else {
            System.out.println("Invalid index");
        }

        // 15. Multi-Dimensional ArrayList
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();
        System.out.println("Enter elements for 3x3 Multi-Dimensional ArrayList:");
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(in.nextInt());
            }
        }
        System.out.println("Multi-Dimensional ArrayList: " + multiList);
        in.close();
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

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }
}