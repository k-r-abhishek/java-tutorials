public class SquareRootBinarySearch {
    public static void main(String[] args) {
        int number = 40;  // The number whose square root we want to find
        int precision = 3; // Number of decimal places for precision

        // Finding the square root using binary search
        System.out.printf("Square root of %d (up to %d decimal places): %.3f", number, precision, sqrt(number, precision));
    }

    /**
     * Computes the square root of a number using Binary Search with decimal precision.
     * 
     * @param n The number whose square root is to be calculated.
     * @param p The number of decimal places of precision.
     * @return The approximate square root of n with p decimal places.
     */
    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;

        // Binary Search to find the integer part of the square root
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid; // Perfect square case
            }

            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
                root = mid; // Store the last valid mid value
            }
        }

        // Refining the answer for decimal precision
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment; // Step back once we exceed n
            increment /= 10;   // Reduce increment for next decimal place
        }

        return root;
    }
}