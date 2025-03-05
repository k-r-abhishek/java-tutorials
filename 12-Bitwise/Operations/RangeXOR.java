public class RangeXOR {
    public static void main(String[] args) {
        // Range XOR for numbers from 'a' to 'b' is calculated as:
        // XOR(a, b) = XOR(0 to b) ^ XOR(0 to a-1)
        
        int a = 3;
        int b = 9;
        
        // Efficient approach using the XOR formula
        int efficientXOR = xor(b) ^ xor(a - 1);
        System.out.println("Efficient XOR from " + a + " to " + b + " = " + efficientXOR);

        // Brute force approach for verification (will cause TLE for large numbers)
        int bruteForceXOR = 0;
        for (int i = a; i <= b; i++) {
            bruteForceXOR ^= i;
        }
        System.out.println("Brute force XOR from " + a + " to " + b + " = " + bruteForceXOR);
    }

    /**
     * Computes XOR from 0 to a using a mathematical pattern.
     * The pattern follows:
     *   - If a % 4 == 0 → result = a
     *   - If a % 4 == 1 → result = 1
     *   - If a % 4 == 2 → result = a + 1
     *   - If a % 4 == 3 → result = 0
     *
     * @param a the number up to which XOR is calculated
     * @return XOR of numbers from 0 to a
     */
    static int xor(int a) {
        switch (a % 4) {
            case 0: return a;
            case 1: return 1;
            case 2: return a + 1;
            default: return 0;
        }
    }
}