// 8. StringBuffer (Mutable Strings)
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Abhishek");
        sb.append(" Prasad");
        System.out.println(sb);
        sb.insert(8, " Awesome");
        System.out.println(sb);
        sb.replace(8, 16, " Great");
        System.out.println(sb);
        sb.delete(8, 13);
        System.out.println(sb);
    }
}