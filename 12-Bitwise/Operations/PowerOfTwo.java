import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking if n is a power of 2 using bitwise AND trick
        boolean ans = (n > 0) && ((n & (n - 1)) == 0);

        // Output result
        System.out.println(n + " is a power of two: " + ans);

        sc.close();
    }
}