/*
 * Loops in Java: While, Do-While, For, and Enhanced For
 * 
 * Loops are used to repeatedly execute a block of statements.
 * We have four types of loops in Java:
 * 1. While Loop
 * 2. Do-While Loop
 * 3. For Loop
 * 4. Enhanced For Loop
 * 
 * Each loop type has its specific use case depending on the conditions and number of iterations.
 */

public class LoopsExample {
    public static void main(String[] args) {
        
        // While Loop: Executes as long as the condition is true.
        int i = 1;
        System.out.println("While Loop:");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        
        // Do-While Loop: Executes the loop body at least once, then checks the condition.
        int j = 1;
        System.out.println("\nDo-While Loop:");
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // For Loop: Best used when the number of iterations is known.
        System.out.println("\nFor Loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        // Enhanced For Loop: Useful for iterating through arrays or collections.
        System.out.println("\nEnhanced For Loop (Array iteration):");
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.println(num);
        }

        // Break Statement: Exit the loop immediately.
        System.out.println("\nExample of 'break' (exit loop early):");
        for (int l = 1; l <= 10; l++) {
            if (l == 6) {
                break;
            }
            System.out.println(l);
        }

        // Continue Statement: Skips the current iteration and moves to the next one.
        System.out.println("\nExample of 'continue' (skip iteration):");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                continue;
            }
            System.out.println(m);
        }

        // Nested Loops: Loops inside loops for multi-dimensional iteration (e.g., 2D arrays).
        System.out.println("\nExample of Nested Loops:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("Row " + row + ", Column " + col + " | ");
            }
            System.out.println();
        }

        // Infinite Loop: Be careful of conditions that lead to infinite loops.
        System.out.println("\nInfinite Loop Example (Uncomment to run):");
        // Uncomment the following to see how an infinite loop works
        // while (true) {
        //     System.out.println("This loop will run forever!");
        // }
    }
}