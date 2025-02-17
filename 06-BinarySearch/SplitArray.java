// Problem: Split Array Largest Sum (Leetcode)
// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {

    public static void main(String[] args) {
        // This is where you would call the splitArray method to test
    }

    // Function to split the array into 'm' subarrays such that 
    // the largest sum among the subarrays is minimized.
    public int splitArray(int[] nums, int m) {
        int start = 0;  // Variable to track the smallest possible largest sum (max element in the array)
        int end = 0;    // Variable to track the largest possible sum (sum of all elements)
        
        // Iterate through the array to determine the possible range for binary search
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // Update 'start' to be the max element in the array
            end += nums[i];                   // Update 'end' to be the sum of all elements in the array
        }

        // Binary search for the optimal largest sum for the subarrays
        while (start < end) {
            // Try the middle value as the potential answer for the maximum sum
            int mid = start + (end - start) / 2;

            // Calculate how many subarrays we can create with 'mid' as the largest sum
            int sum = 0;      // Variable to accumulate the sum of the current subarray
            int pieces = 1;   // Start with one subarray (we need at least one subarray)
            
            // Iterate through the array to check how many subarrays we can create
            for (int num : nums) {
                if (sum + num > mid) { // If adding the current number exceeds the 'mid' sum
                    sum = num;    // Start a new subarray, set sum to the current number
                    pieces++;     // Increase the count of subarrays
                } else {
                    sum += num;   // Otherwise, continue adding to the current subarray
                }
            }

            // If the number of subarrays exceeds 'm', it means 'mid' is too small
            if (pieces > m) {
                start = mid + 1;  // We need a larger value for 'mid'
            } else {
                end = mid;  // We can create 'm' or fewer subarrays, try smaller values for 'mid'
            }
        }
        
        // When the binary search completes, 'start' and 'end' will converge to the optimal maximum sum
        return end;
    }
}