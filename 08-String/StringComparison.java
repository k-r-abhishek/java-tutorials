// 2. String Comparisons
public class StringComparison {
    public static void main(String[] args) {
        String a = "Abhishek";
        String b = "Abhishek";
        System.out.println(a == b); // true (same reference in string pool)

        String name1 = new String("Abhishek");
        String name2 = new String("Abhishek");
        System.out.println(name1 == name2); // false (different objects)
        System.out.println(name1.equals(name2)); // true (same value)
    }
}