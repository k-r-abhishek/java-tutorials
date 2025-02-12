import java.util.Arrays;
import java.util.Scanner;

public class JavaRevision {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sum of two numbers using method
        sum(input);

        // Greeting function
        greet();

        // Sum using return value
        int result = sumWithReturn(input);
        System.out.println("Returned Sum: " + result);

        // Returning a string
        String message = getMessage(input);
        System.out.println("Your message: " + message);

        // Passing values to a function
        int calculatedSum = sumWithParameters(25, 75);
        System.out.println("Sum with parameters: " + calculatedSum);

        // Personalized greeting
        System.out.print("Enter your name: ");
        String name = input.next();
        String personalizedGreeting = personalizeGreeting(name);
        System.out.println(personalizedGreeting);

        // Swapping numbers
        System.out.print("Enter two numbers to swap: ");
        int x = input.nextInt();
        int y = input.nextInt();
        swapNumbers(x, y);

        // Changing values in an array
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("Modified Array: " + Arrays.toString(arr));

        // Scope demonstration
        demonstrateScope();

        // Shadowing variable
        shadowingExample();

        // Using variable arguments (Varargs)
        int varargSum = sumVarargs(5, 10, 15, 20, 25);
        System.out.println("Sum using varargs: " + varargSum);

        input.close();
    }

    // Sum of two numbers (using user input)
    static void sum(Scanner input) {
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum: " + (a + b));
    }

    // Greeting function
    static void greet() {
        System.out.println("Hey, how are you? :)");
    }

    // Sum of two numbers (with return value)
    static int sumWithReturn(Scanner input) {
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        return a + b;
    }

    // Returning a string
    static String getMessage(Scanner input) {
        System.out.print("Enter a message: ");
        input.nextLine(); // Consume the leftover newline
        return input.nextLine();
    }

    // Sum using parameters
    static int sumWithParameters(int a, int b) {
        return a + b;
    }

    // Personalized greeting function
    static String personalizeGreeting(String name) {
        return "Hello, " + name + "! Welcome!";
    }

    // Swapping numbers
    static void swapNumbers(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Modifying an array
    static void modifyArray(int[] arr) {
        arr[0] = 99;  // Changes will reflect in the original array
    }

    // Demonstrating scope
    static void demonstrateScope() {
        int a = 10; // Local variable
        {
            int b = 20; // Block scope
            System.out.println("Inside block: a = " + a + ", b = " + b);
        }
        // System.out.println(b); // This will cause an error (b is out of scope)
        System.out.println("Outside block: a = " + a);
    }

    // Shadowing example
    static void shadowingExample() {
        int x = 50;
        System.out.println("Before shadowing: x = " + x);
        {
            // Instead of declaring a new variable, just assign a new value
            int y = 100;  // Declare a different variable
            System.out.println("After shadowing inside block: y = " + y);
        }
        System.out.println("Outside block: x = " + x);
    }
    

    // Variable arguments (Varargs method)
    static int sumVarargs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}