package dsa.array;

public class FindPivotIndex {
        public static int pivotIndex(int[] nums) {
            int totalSum=0;
            for(int num:nums){
                totalSum+=num;
            }

            int leftSum=0;
            for(int i=0;i<nums.length;i++){
                if(leftSum==totalSum-leftSum-nums[i]){
                    return i;
                }
                leftSum+=nums[i];
            }

            return -1;

        }

        public static void main(String[] args) {

            // Example 1
            int[] nums1 = {1, 7, 3, 6, 5, 6};
            int output1 = pivotIndex(nums1);
            System.out.println("Example 1: " + output1); // Output: 3

            // Example 2
            int[] nums2 = {1, 2, 3};
            int output2 = pivotIndex(nums2);
            System.out.println("Example 2: " + output2); // Output: -1

            // Example 3
            int[] nums3 = {2, 1, -1};
            int output3 = pivotIndex(nums3);
            System.out.println("Example 3: " + output3); // Output: 0
        }





}

/*
https://leetcode.com/problems/find-pivot-index/
 */
