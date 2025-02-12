import java.util.Scanner;

public class ArmstrongNumbers {
    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length(); // Convert number to string and get its length
    }

    // Function to check if a given number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        int digits = countDigits(num); // Get the number of digits
        
        // Calculate the sum of each digit raised to the power of the total number of digits
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add its power to the sum
            temp /= 10; // Remove the last digit
        }
        return sum == num; // Check if the computed sum equals the original number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the digit count for Armstrong numbers: ");
        int choice = scanner.nextInt(); // Read user input for digit count
        
        // Define range based on the number of digits
        int start = (int) Math.pow(10, choice - 1); // Smallest number with given digits
        int end = (int) Math.pow(10, choice) - 1;   // Largest number with given digits
        
        System.out.println(choice + "-digit Armstrong numbers are:");
        
        // Loop through the range and check for Armstrong numbers
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " "); // Print Armstrong number
            }
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}