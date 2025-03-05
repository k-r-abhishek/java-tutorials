public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findUnique(arr)); // Output the unique element
    }

    /**
     * This method finds the unique element in an array where every other element appears twice.
     * It uses the XOR (^) operation to cancel out duplicate numbers.
     */
    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n; // XOR operation: a ^ a = 0, a ^ 0 = a (cancels out duplicates)
        }
        return unique;
    }
}