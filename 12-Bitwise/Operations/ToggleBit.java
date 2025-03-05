public class ToggleBit {
    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int i = 1; // 0-based index (toggle 2nd bit)
        
        // XOR with (1 << i) flips the i-th bit
        n = n ^ (1 << i);
        
        System.out.println("After toggling bit " + i + " : " + Integer.toBinaryString(n));
    }
}