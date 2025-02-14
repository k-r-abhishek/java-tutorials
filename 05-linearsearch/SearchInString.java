import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "hello world";
        char target = 'w'; // Character to search
        
        int index = searchInString(str, target);
        
        if (index != -1) {
            System.out.println("Character '" + target + "' found at index: " + index);
        } else {
            System.out.println("Character not found.");
        }
        input.close();
    }

    static int searchInString(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
