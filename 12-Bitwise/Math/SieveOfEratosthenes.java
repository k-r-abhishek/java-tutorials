public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40; // Find all prime numbers up to n
        boolean[] isComposite = new boolean[n + 1]; // false means prime

        System.out.println("Prime numbers up to " + n + " are:");
        sieve(n, isComposite);
    }

    /**
     * Uses the Sieve of Eratosthenes algorithm to find all prime numbers up to n.
     * - We assume all numbers are prime initially (false in the boolean array).
     * - If a number is prime, mark all its multiples as composite (true in array).
     *
     * @param n The upper limit to find prime numbers
     * @param isComposite Boolean array to mark non-prime numbers (true if composite)
     */
    static void sieve(int n, boolean[] isComposite) {
        // Start marking from 2 (smallest prime)
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) { // If i is prime
                // Mark all multiples of i as composite
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after printing primes
    }
}