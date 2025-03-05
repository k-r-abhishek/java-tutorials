import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

        in.close();
    }
}