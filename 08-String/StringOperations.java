// 4. String Operations
import java.util.ArrayList;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 1);   // a1 (integer converted to string)
        System.out.println('a' + 'b'); // 195 (adds ASCII values)
        System.out.println((char)('a' + 1));

        // Demonstrating array operations
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("Array element at index 1: " + strArray[1]); // banana
        
        // Demonstrating ArrayList operations
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.println("ArrayList elements: " + strList);
    }
    
}