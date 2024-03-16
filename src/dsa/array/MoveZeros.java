package dsa.array;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Swap the non-zero element with the element at nonZeroPointer
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[i];
                nums[i] = temp;
                // Move the nonZeroPointer forward
                nonZeroPointer++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }
}
/*
https://leetcode.com/problems/move-zeroes/

283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */