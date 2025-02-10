/*
 * 2. Taking Input using Scanner
 */
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        input.close();
    }
}