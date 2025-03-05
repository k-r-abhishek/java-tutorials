import java.util.ArrayList;

/**
 * This program demonstrates different approaches to find the factors of a given number.
 * - `factors1(n)`: Naive approach with O(n) time complexity.
 * - `factors2(n)`: Optimized approach using O(sqrt(n)) time.
 * - `factors3(n)`: Efficient approach that prints factors in sorted order using extra space.
 */
public class FactorizationMethods {
    public static void main(String[] args) {
        int number = 36;
        System.out.println("Factors using O(n) approach:");
        factors1(number);
        
        System.out.println("\nFactors using O(√n) approach:");
        factors2(number);
        
        System.out.println("\nFactors using O(√n) approach (sorted order):");
        factors3(number);
    }

    /**
     * Finds factors using a naive approach.
     * Time Complexity: O(n)
     * @param n The number whose factors are to be found.
     */
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Optimized approach to find factors using O(√n) time complexity.
     * @param n The number whose factors are to be found.
     */
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) { // If divisors are equal, print only once
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + (n / i) + " ");
                }
            }
        }
        System.out.println();
    }

    /**
     * Optimized approach that also ensures factors are printed in sorted order.
     * Time Complexity: O(√n), Space Complexity: O(√n) (extra space for storing factors).
     * @param n The number whose factors are to be found.
     */
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) { // If divisors are equal, print only once
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");  // Print smaller factor
                    list.add(n / i);  // Store larger factor for later printing
                }
            }
        }
        
        // Print the stored larger factors in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}