import java.util.*;

public class ArrayListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Taking input for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Taking input in a loop
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // Taking input and adding to the list
        }

        // Displaying the ArrayList
        System.out.println("ArrayList elements: " + list);

        sc.close(); // Closing Scanner
    }
}