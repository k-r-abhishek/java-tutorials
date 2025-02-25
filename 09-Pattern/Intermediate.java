import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();

        System.out.println("\nDiamond Pattern:");
        diamondPattern(n);

        System.out.println("\nHollow Diamond Pattern:");
        hollowDiamond(n);

        System.out.println("\nButterfly Pattern:");
        butterflyPattern(n);

        System.out.println("\nSandglass Pattern:");
        sandglassPattern(n);

        System.out.println("\nHourglass Pattern:");
        hourglassPattern(n);

        System.out.println("\nFloyd's Triangle:");
        floydsTriangle(n);

        System.out.println("\nPascal's Triangle:");
        pascalsTriangle(n);

        System.out.println("\nZig-Zag Pattern:");
        zigZagPattern(n);

        System.out.println("\nHollow Diamond with Numbers:");
        hollowDiamondWithNumbers(n);

        System.out.println("\nRight Pascal's Triangle:");
        rightPascalsTriangle(n);

        System.out.println("\nLeft Pascal's Triangle:");
        leftPascalsTriangle(n);

        in.close();
    }

    // 1. Diamond Pattern (Solid)
    static void diamondPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < n; col++) System.out.print(" ");
            for (int col = 1; col <= (2 * row - 1); col++) System.out.print("*");
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = n; col > row; col--) System.out.print(" ");
            for (int col = 1; col <= (2 * row - 1); col++) System.out.print("*");
            System.out.println();
        }
    }

    // 2. Hollow Diamond Pattern
    static void hollowDiamond(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < n; col++) System.out.print(" ");
            for (int col = 1; col <= (2 * row - 1); col++) 
                System.out.print((col == 1 || col == (2 * row - 1)) ? "*" : " ");
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = n; col > row; col--) System.out.print(" ");
            for (int col = 1; col <= (2 * row - 1); col++) 
                System.out.print((col == 1 || col == (2 * row - 1)) ? "*" : " ");
            System.out.println();
        }
    }

    // 3. Butterfly Pattern
    static void butterflyPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            for (int col = 1; col <= 2 * (n - row); col++) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            for (int col = 1; col <= 2 * (n - row); col++) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
    }

    // 4. Sandglass Pattern
    static void sandglassPattern(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col > row; col--) System.out.print(" ");
            for (int col = 1; col <= 2 * row - 1; col++) System.out.print("*");
            System.out.println();
        }
        for (int row = 2; row <= n; row++) {
            for (int col = n; col > row; col--) System.out.print(" ");
            for (int col = 1; col <= 2 * row - 1; col++) System.out.print("*");
            System.out.println();
        }
    }

    // 5. Hourglass Pattern
    static void hourglassPattern(int n) {
        sandglassPattern(n);
    }

    // 6. Floyd's Triangle
    static void floydsTriangle(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) System.out.print(count++ + " ");
            System.out.println();
        }
    }

    // 7. Pascal's Triangle
    static void pascalsTriangle(int n) {
        for (int row = 0; row < n; row++) {
            int num = 1;
            for (int col = 0; col < n - row; col++) System.out.print(" ");
            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num = num * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }

    // 8. Zig-Zag Pattern
    static void zigZagPattern(int n) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row + col) % 4 == 0 || (row == 2 && col % 4 == 0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 9. Hollow Diamond with Numbers
    static void hollowDiamondWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print((j == 1 || j == (2 * i - 1)) ? i : " ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print((j == 1 || j == (2 * i - 1)) ? i : " ");
            System.out.println();
        }
    }

    // 10. Right Pascal’s Triangle
    static void rightPascalsTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
    }

    // 11. Left Pascal’s Triangle
    static void leftPascalsTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < n; col++) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = row; col < n; col++) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print("*");
            System.out.println();
        }
    }
}