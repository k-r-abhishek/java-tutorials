// 9. StringBuilder vs StringBuffer (Performance Test)
public class StringPerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer("Abhishek");
        for (int i = 0; i < 10000; i++) {
            sb.append("K");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder sbl = new StringBuilder("Abhishek");
        for (int i = 0; i < 10000; i++) {
            sbl.append("K");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}