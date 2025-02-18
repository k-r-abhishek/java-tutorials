/*
 * 6. Count Digit Occurrence
 */
import java.util.Scanner;
public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        System.out.print("Enter the digit to count: ");
        int digit = input.nextInt();
        
        int count = 0, temp = num;
        while (temp > 0) {
            if (temp % 10 == digit) count++;
            temp /= 10;
        }
        
        System.out.println("The digit " + digit + " appears " + count + " times in " + num);
        input.close();
    }
}