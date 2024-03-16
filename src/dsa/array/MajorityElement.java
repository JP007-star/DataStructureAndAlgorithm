package dsa.array;
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1)); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums2)); // Output: 2
    }
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Step 1: Find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Validate the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // The candidate is the majority element
        if (count > nums.length / 2) {
            return candidate;
        }

        // In case there is no majority element (this should not happen based on the problem statement)
        return -1;
    }


}


    /*
    *
Boyer-Moore Voting Algorithm.
The idea is to cancel out each occurrence of an element with all the other elements that are different from it.
The majority element will be the one that remains after the cancellations.


Given an array nums of size n, return the majority element.


The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

    * https://leetcode.com/problems/majority-element/*/

