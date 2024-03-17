package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();

        // Iterate through the array to mark the presence of each number
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value of nums[i] as index
            int index = Math.abs(nums[i]) - 1;
            // Mark the number at index as negative to indicate its presence
            nums[index] = -Math.abs(nums[index]);
        }

        // Iterate through the array to find indices that are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                // The index (i + 1) corresponds to the missing number
                disappearedNumbers.add(i + 1);
            }
        }

        return disappearedNumbers;
    }
    public static void main(String[] args) {

        // Test cases
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums1));  // Output: [5, 6]

        int[] nums2 = {1, 1};
        System.out.println(findDisappearedNumbers(nums2));  // Output: [2]
    }
}
