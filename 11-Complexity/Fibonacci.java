public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50)); // Using Binet's Formula to find the 50th Fibonacci number
    }

    /**
     * This method calculates the nth Fibonacci number using Binet's Formula.
     * Formula: F(n) = ( (ϕ^n) - (ψ^n) ) / sqrt(5)
     * Where:
     *   ϕ (phi) = (1 + sqrt(5)) / 2  -> Golden Ratio
     *   ψ (psi) = (1 - sqrt(5)) / 2  -> Conjugate of Golden Ratio
     * 
     * This method is efficient for small values of n but may lose precision for very large values.
     */
    static long fiboFormula(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;  // Golden ratio
        return Math.round(Math.pow(phi, n) / sqrt5); // Applying Binet's formula
    }

    /**
     * This method calculates the nth Fibonacci number using recursion.
     * Time Complexity: O(2^n) (Exponential, very slow for large n)
     */
    static int fibo(int n) {
        if (n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}