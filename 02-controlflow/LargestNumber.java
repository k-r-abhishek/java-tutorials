/*
 * 3. Finding the Largest Number
 */
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Largest number is: " + max);
        input.close();
    }
}