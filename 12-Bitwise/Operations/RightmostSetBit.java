public class RightmostSetBit {
    public static void main(String[] args) {
        int n = 12; // Binary: 1100
        
        // Extracts the rightmost set bit using n & -n
        int rightmostSetBit = n & -n; 
        
        System.out.println("Rightmost set bit of " + n + " : " + rightmostSetBit);
    }
}