// 5. Performance with Strings
public class StringPerformance {
    public static void main(String[] args) {
        // Initializing StringBuilder with default capacity (16 characters, auto-expands as needed)
        StringBuilder sb = new StringBuilder();
        
        // Ensuring capacity beforehand to avoid frequent resizing (26 characters for a-z)
        sb.ensureCapacity(26);
        
        // Appending characters from 'a' to 'z' to StringBuilder
        for (int i = 0; i < 26; i++) {
            sb.append((char)('a' + i)); // Append each character to StringBuilder
        }
        
        // Convert StringBuilder to String and print
        System.out.println(sb.toString()); // Output: abcdefghijklmnopqrstuvwxyz
        
        // Demonstrating additional StringBuilder properties
        System.out.println("Length: " + sb.length()); // Prints the length of the string (26)
        System.out.println("Capacity: " + sb.capacity()); // Prints the capacity (at least 26, depends on growth factor)
        
        // Checking if StringBuilder is empty
        System.out.println("Is Empty: " + (sb.length() == 0));
        
        // Inserting a string at a specific index
        sb.insert(0, "Start-"); 
        System.out.println("After Insertion: " + sb);
        
        // Deleting a substring from the StringBuilder
        sb.delete(0, 6);
        System.out.println("After Deletion: " + sb);
        
        // Reversing the string
        sb.reverse();
        System.out.println("Reversed: " + sb);
        
        // Converting back to normal order
        sb.reverse();
        
        // Replacing a portion of the string
        sb.replace(0, 5, "Hello");
        System.out.println("After Replace: " + sb);
        
        // Converting StringBuilder to a String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
        
        // Clearing the StringBuilder
        sb.setLength(0);
        System.out.println("After Clearing: " + sb);
    }
}