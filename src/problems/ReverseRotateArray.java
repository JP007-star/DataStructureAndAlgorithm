package problems;

import java.util.concurrent.CopyOnWriteArrayList;

public class ReverseRotateArray {
    public static void main(String[] args) {
           int[] nums ={1,3,5,6,8,9};
           int k=2;
           int result[]=sort(nums);
        for (int num:
             result) {
            System.out.print(num);
        }
    }


    public static int[] sort(int[] nums){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }

        }

      return nums;
    }












    public static int [] rotate(int[] nums, int k) {

        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }

    public static int[] reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}


/*

https://leetcode.com/problems/rotate-array/

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

 */
