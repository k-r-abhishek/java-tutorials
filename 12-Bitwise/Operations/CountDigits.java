import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number and base
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        // Using logarithm to find the number of digits in the given base
        int digit = (int) (Math.log(n) / Math.log(base)) + 1;

        // Output result
        System.out.println("Number of digits in base " + base + ": " + digit);

        sc.close();
    }
}