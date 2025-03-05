public class PositionOfSetBit {
    public static void main(String[] args) {
        int n = 16; // Binary: 10000
        
        // Log base 2 finds the index of the set bit (0-based, so add 1)
        int position = (int)(Math.log(n) / Math.log(2)) + 1;
        
        System.out.println("Position of the only set bit in " + n + " : " + position);
    }
}