import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = in.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        in.close();
    }

    static int fibonacci(int n) {

        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}