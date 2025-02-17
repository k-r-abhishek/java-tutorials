public class SmallestLetter {

    public static void main(String[] args) {
        // You can add test cases here for debugging
    }

    // Function to find the smallest letter greater than the target
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // Calculate mid to avoid integer overflow
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                // If target is smaller than mid, the answer might be mid or on the left
                end = mid - 1;
            } else {
                // If target is greater than or equal to mid, move right to find a greater letter
                start = mid + 1;
            }
        }
        // If start goes out of bounds, wrap around using modulo operator
        return letters[start % letters.length];
    }
}