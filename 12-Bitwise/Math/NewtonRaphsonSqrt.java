// Program to find the square root of a number using Newton-Raphson Method

public class NewtonRaphsonSqrt {
    public static void main(String[] args) {
        double number = 40;
        System.out.println("Approximate Square Root: " + sqrt(number));
    }

    /**
     * Uses the Newton-Raphson method to compute the square root of a number.
     * Time Complexity: O(log n)
     *
     * @param n The number whose square root is to be calculated.
     * @return The approximate square root of n.
     */
    static double sqrt(double n) {
        double x = n;  // Initial guess (can be any positive number)
        double root;

        while (true) {
            // Newton's formula: xₙ₊₁ = 0.5 * (xₙ + n / xₙ)
            root = 0.5 * (x + (n / x));

            // Stop if the difference between two iterations is small enough
            if (Math.abs(root - x) < 0.0001) { // Precision threshold
                break;
            }

            x = root; // Update x for the next iteration
        }
        return root;
    }
}