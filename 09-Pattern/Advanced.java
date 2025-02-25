import java.util.*;

public class Advanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd for best visuals): ");
        int n = in.nextInt();

        System.out.println("\n Heart Shape Pattern:");
        heartPattern(n);

        System.out.println("\n Hollow Butterfly Pattern:");
        hollowButterfly(n);

        System.out.println("\n Spiral Number Pattern:");
        spiralNumberPattern(n);

        System.out.println("\n X-Shape Star Pattern:");
        xShapeStar(n);

        System.out.println("\n Wave Pattern:");
        wavePattern(n);

        System.out.println("\n Arrow Pattern:");
        arrowPattern(n);

        System.out.println("\n Pyramid with Increasing Numbers:");
        pyramidWithNumbers(n);

        System.out.println("\n Symmetric Hourglass with Stars and Numbers:");
        symmetricHourglass(n);

        System.out.println("\n 3D Cone Pattern:");
        conePattern(n);

        System.out.println("\n Hexagonal Star Pattern:");
        hexagonalStar(n);

        in.close();
    }

    // 1. 💖 Heart Shape Pattern
    static void heartPattern(int n) {
        // Upper two arcs of the heart
        for (int row = n / 2; row <= n; row += 2) {
            for (int col = 1; col < n - row; col += 2) System.out.print(" ");
            for (int col = 1; col <= row; col++) 
                System.out.print((col == 1 || col == row) ? "*" : " ");
            for (int col = 1; col <= n - row; col++) System.out.print(" ");
            for (int col = 1; col <= row; col++) 
                System.out.print((col == 1 || col == row) ? "*" : " ");
            System.out.println();
        }

        // Lower triangular part of the heart
        for (int row = n; row >= 1; row--) {
            for (int col = 0; col < n - row; col++) System.out.print(" ");
            for (int col = 1; col <= (2 * row) - 1; col++) 
                System.out.print((col == 1 || col == (2 * row) - 1) ? "*" : " ");
            System.out.println();
        }
    }

    // 2. 🦋 Hollow Butterfly Pattern
    static void hollowButterfly(int n) {
        for (int row = 1; row <= n; row++) printRow(n, row);
        for (int row = n; row >= 1; row--) printRow(n, row);
    }

    static void printRow(int n, int row) {
        System.out.print("*");
        if (row > 1) System.out.print(" ".repeat(row - 2) + "*");
        System.out.print(" ".repeat(2 * (n - row)));
        System.out.print("*");
        if (row > 1) System.out.print(" ".repeat(row - 2) + "*");
        System.out.println();
    }

    // 3. 🔄 Spiral Number Pattern
    static void spiralNumberPattern(int n) {
        int[][] arr = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;

        while (num <= n * n) {
            for (int col = left; col <= right; col++) arr[top][col] = num++;
            top++;
            for (int row = top; row <= bottom; row++) arr[row][right] = num++;
            right--;
            for (int col = right; col >= left; col--) arr[bottom][col] = num++;
            bottom--;
            for (int row = bottom; row >= top; row--) arr[row][left] = num++;
            left++;
        }
        for (int[] row : arr) {
            for (int val : row) System.out.printf("%3d", val);
            System.out.println();
        }
    }

    // 4. ❌ X-Shape Star Pattern
    static void xShapeStar(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col || row + col == n - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 5. 🌊 Wave Pattern
    static void wavePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++)
                System.out.print((row % 2 == 0) ? "~ " : "* ");
            System.out.println();
        }
    }

    // 6. ➡️ Arrow Pattern
    static void arrowPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) System.out.print(" ");
            System.out.println("*");
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int col = 1; col < row; col++) System.out.print(" ");
            System.out.println("*");
        }
    }

    // 7. 🔼 Pyramid with Increasing Numbers
    static void pyramidWithNumbers(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < n; col++) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print(col + " ");
            System.out.println();
        }
    }

    // 8. ⌛ Symmetric Hourglass with Stars and Numbers
    static void symmetricHourglass(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col > row; col--) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print(col + "*");
            System.out.println();
        }
        for (int row = 2; row <= n; row++) {
            for (int col = n; col > row; col--) System.out.print(" ");
            for (int col = 1; col <= row; col++) System.out.print(col + "*");
            System.out.println();
        }
    }

    // 9. 🛸 3D Cone Pattern
    static void conePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < n; col++) System.out.print(" ");
            for (int col = 1; col <= (2 * row - 1); col++) System.out.print("/");
            System.out.print("|");
            for (int col = 1; col <= (2 * row - 1); col++) System.out.print("\\");
            System.out.println();
        }
    }

    // 10. ⭐ Hexagonal Star Pattern
    static void hexagonalStar(int n) {
        // Upper part of hexagon
        for (int row = 1; row <= n; row++) {
            System.out.print(" ".repeat(n - row));  // Leading spaces
            System.out.println("* ".repeat(n + (row - 1))); // Stars
        }
        
        // Lower part of hexagon
        for (int row = n - 1; row >= 1; row--) {
            System.out.print(" ".repeat(n - row));  // Leading spaces
            System.out.println("* ".repeat(n + (row - 1))); // Stars
        }
    }
    
}