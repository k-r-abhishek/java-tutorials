// Program to compute GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
public class GCDAndLCM {
    public static void main(String[] args) {
        int num1 = 2, num2 = 7;

        // Finding GCD
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));

        // Finding LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }

    /**
     * Computes the Greatest Common Divisor (GCD) of two numbers using
     * the Euclidean Algorithm.
     * 
     * @param a First number
     * @param b Second number
     * @return GCD of a and b
     */
    static int gcd(int a, int b) {
        if (a == 0) return b; // Base case
        return gcd(b % a, a); // Recursive step
    }

    /**
     * Computes the Least Common Multiple (LCM) of two numbers.
     * 
     * Formula: LCM(a, b) = (a * b) / GCD(a, b)
     * 
     * @param a First number
     * @param b Second number
     * @return LCM of a and b
     */
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}