/*
 * 8. Simple Calculator
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = (num2 != 0) ? num1 / num2 : Double.NaN;
            case '%' -> result = (num2 != 0) ? num1 % num2 : Double.NaN;
            default -> {
                System.out.println("Invalid Operator");
                input.close();  // ✅ Close Scanner before returning
                return;
            }
        }

        System.out.println("Result: " + result);
        input.close(); // ✅ Close Scanner at the end
    }
}