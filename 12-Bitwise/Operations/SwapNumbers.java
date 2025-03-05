public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        
        // XOR swap algorithm
        a = a ^ b;  // Step 1: a now holds (a XOR b)
        b = a ^ b;  // Step 2: b gets original value of a
        a = a ^ b;  // Step 3: a gets original value of b

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}