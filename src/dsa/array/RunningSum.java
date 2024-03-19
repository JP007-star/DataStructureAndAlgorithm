package dsa.array;

import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]+nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {1, 2, 3, 4};
        int[] output1 = runningSum(nums1);
        System.out.println("Example 1: " + Arrays.toString(output1)); // Output: [1, 3, 6, 10]

        // Example 2
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] output2 = runningSum(nums2);
        System.out.println("Example 2: " + Arrays.toString(output2)); // Output: [1, 2, 3, 4, 5]

        // Example 3
        int[] nums3 = {3, 1, 2, 10, 1};
        int[] output3 = runningSum(nums3);
        System.out.println("Example 3: " + Arrays.toString(output3)); // Output: [3, 4, 6, 16, 17]

    }
}

/*
https://leetcode.com/problems/running-sum-of-1d-array/

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */
