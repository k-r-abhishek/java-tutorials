public class UpperToLower {
    public static void main(String[] args) {
        char uppercase = 'A';
        
        // OR-ing with space character (' ') sets the 5th bit to 1, converting to lowercase
        char lowercase = (char) (uppercase | ' '); 
        
        System.out.println("Lowercase of " + uppercase + " is " + lowercase);
    }
}