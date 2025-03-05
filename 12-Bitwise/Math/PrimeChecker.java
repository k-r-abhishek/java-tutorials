public class PrimeChecker {
    public static void main(String[] args) {
        int n = 20; // Checking prime numbers from 2 to 20
        
        System.out.println("Prime number check from 2 to " + n);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " is prime? " + isPrime(i));
        }
    }

    /**
     * Checks if a given number is prime.
     * A prime number is only divisible by 1 and itself.
     *
     * Optimized approach:
     * - Any number <= 1 is not prime.
     * - Only check divisibility up to sqrt(n), as factors repeat after sqrt(n).
     *
     * @param num The number to check
     * @return true if num is prime, false otherwise
     */
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }

        // Check divisibility from 2 to sqrt(num)
        for (int divisor = 2; divisor * divisor <= num; divisor++) {
            if (num % divisor == 0) {
                return false; // If divisible, not prime
            }
        }

        return true; // Prime if no divisors found
    }
}