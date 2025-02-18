/*
 * 7. Reverse a Number
 */
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt(), reversed = 0;
        
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        System.out.println("Reversed Number: " + reversed);
        input.close();
    }
}