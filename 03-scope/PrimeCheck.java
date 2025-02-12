import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for user input
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Read input number from user
        System.out.println(isPrime(num) ? "Prime" : "Not Prime"); // Print result based on prime check
        input.close();
    }

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        if (num == 2) return true; // 2 is the only even prime number
        if (num % 2 == 0) return false; // All other even numbers are not prime

        // Check divisibility for odd numbers only, from 3 to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) { 
            if (num % i == 0) return false; // If divisible, it's not a prime number
        }
        return true; // If no divisors found, the number is prime
    }
}