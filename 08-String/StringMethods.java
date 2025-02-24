// 3. String Methods
import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.toUpperCase()); // HELLO WORLD
        System.out.println(str.indexOf('o'));  // 4
        System.out.println("  Trim Me  ".strip()); // "Trim Me"
        System.out.println(Arrays.toString(str.split(" "))); // [Hello, World]
    }
}