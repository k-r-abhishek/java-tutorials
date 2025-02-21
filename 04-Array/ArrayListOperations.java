import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Adding elements
        list.add(10);  // Adds 10 at index 0
        list.add(20);  // Adds 20 at index 1
        list.add(30);  // Adds 30 at index 2
        list.add(70);  // Adds 30 at index 3
        System.out.println("After adding elements: " + list);

        // 3. Adding an element at a specific index
        list.add(1, 15); // Inserts 15 at index 1
        System.out.println("After inserting at index 1: " + list);

        // 4. Accessing elements using get()
        int firstElement = list.get(0);
        System.out.println("Element at index 0: " + firstElement);

        // 5. Updating an element using set()
        list.set(2, 25); // Changes element at index 2 to 25
        System.out.println("After updating index 2: " + list);

        // 6. Removing an element by index
        list.remove(3); // Removes element at index 3 (30)
        System.out.println("After removing index 3: " + list);

        // 7. Removing an element by value (first occurrence only)
        list.remove(Integer.valueOf(15)); // Removes element 15
        System.out.println("After removing element 15: " + list);

        // 8. Checking if an element exists
        boolean contains20 = list.contains(20);
        System.out.println("List contains 20? " + contains20);

        // 9. Finding the index of an element
        int index = list.indexOf(25);
        System.out.println("Index of 25: " + index);

        // 10. Iterating using for-each loop
        System.out.print("Elements using for-each loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 11. Iterating using Iterator
        System.out.print("Elements using Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 12. Sorting the ArrayList
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 13. Clearing all elements
        list.clear();
        System.out.println("After clearing all elements: " + list);

        // 14. Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // 15. Initializing an ArrayList with values (Alternative way)
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aman", "Ravi", "Suman"));
        System.out.println("Names List: " + names);
    }
}