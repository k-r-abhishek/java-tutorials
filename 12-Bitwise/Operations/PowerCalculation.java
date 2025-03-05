import java.util.Scanner;

public class PowerCalculation {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter base (a): ");
        long a = sc.nextLong();

        System.out.print("Enter exponent (b): ");
        long b = sc.nextLong();

        // Compute a^b using optimized method
        long ans = power(a, b);

        // Output result
        System.out.println(a + " raised to the power " + b + " is: " + ans);

        sc.close();
    }
    // Function to calculate a^b using Exponentiation by Squaring
    static long power(long a, long b) {
        long result = 1;
        
        while (b > 0) {
            // If b is odd, multiply result by a
            if ((b & 1) == 1) {
                result *= a;
            }
            // Square the base and halve the exponent
            a *= a;
            b >>= 1; // Equivalent to b = b / 2
        }
        return result;
    }
}