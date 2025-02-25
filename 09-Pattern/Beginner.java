import java.util.*;

public class Beginner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        // Calling pattern functions
        System.out.println("\nSquare Pattern:");
        squarePattern(n);

        System.out.println("\nRight-Angled Triangle (Half Pyramid):");
        halfPyramid(n);

        System.out.println("\nInverted Right-Angled Triangle (Reverse Half Pyramid):");
        reverseHalfPyramid(n);

        System.out.println("\nFull Pyramid:");
        fullPyramid(n);

        System.out.println("\nInverted Full Pyramid:");
        invertedFullPyramid(n);

        System.out.println("\nHollow Square Pattern:");
        hollowSquare(n);

        System.out.println("\nHollow Right-Angled Triangle:");
        hollowRightAngledTriangle(n);

        System.out.println("\nNumber Pyramid:");
        numberPyramid(n);

        System.out.println("\nCharacter Pyramid:");
        characterPyramid(n);

        in.close();
    }

    // 1. Square Pattern
    static void squarePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Right-Angled Triangle (Half Pyramid)
    static void halfPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Inverted Right-Angled Triangle (Reverse Half Pyramid)
    static void reverseHalfPyramid(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Full Pyramid
    static void fullPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            // Printing leading spaces
            for (int col = row; col < n; col++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int col = 1; col <= (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Inverted Full Pyramid
    static void invertedFullPyramid(int n) {
        for (int row = n; row >= 1; row--) {
            // Printing leading spaces
            for (int col = row; col < n; col++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int col = 1; col <= (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Hollow Square Pattern
    static void hollowSquare(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Print star for borders, space for inner area
                if (row == 1 || row == n || col == 1 || col == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 7. Hollow Right-Angled Triangle
    static void hollowRightAngledTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                // Print star for borders, space for inner area
                if (col == 1 || col == row || row == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 8. Number Pyramid
    static void numberPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // 9. Character Pyramid
    static void characterPyramid(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            ch++; // Move to the next character
            System.out.println();
        }
    }
}