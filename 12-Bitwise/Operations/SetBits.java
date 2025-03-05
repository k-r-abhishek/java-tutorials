public class SetBits {
    public static void main(String[] args) {
        int n = 234567;
        
        // Display binary representation of n
        System.out.println("Binary representation of " + n + " : " + Integer.toBinaryString(n));
        
        // Count and display the number of set bits (1s) in n
        System.out.println("Number of set bits: " + countSetBits(n));
    }

    /**
     * Counts the number of set bits (1s) in the binary representation of a number.
     * Uses Brian Kernighan’s Algorithm:
     *   - Each iteration removes the rightmost set bit (1) using n = n & (n - 1).
     *   - This runs in O(log n) time complexity.
     *
     * Alternative approach (commented out):
     *   - Using n -= (n & -n) which removes the lowest set bit.
     *
     * @param n the number whose set bits are to be counted
     * @return the count of set bits in the binary representation of n
     */
    private static int countSetBits(int n) {
        int count = 0;
        
        while (n > 0) {
            count++;
            n = n & (n - 1); // Removes the rightmost set bit
        }
        
        return count;
    }
}