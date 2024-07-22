package Gamam.TwoSum;

/*

https://leetcode.com/problems/next-permutation/

Steps to Solve the Problem
   1) Identify the Pivot
   2) Find the Successor
   3) Swap the Pivot with the Successor
   4) Reverse the Suffix
 */

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {
        int n= nums.length;

        if(n<=1) return;


//      Step 1: Find the largest index pivot such that nums[pivot] < nums[pivot + 1]

        int pivot=n-2; // first number where its start decreasing

        while ( pivot>=0 && nums[pivot] >= nums[pivot+1] ){
            pivot--;
        }

//      Step 2: Find the largest index nextGreat greater than pivot such that nums[pivot] < nums[nextGreat]

        if(pivot>=0){
            int nextGreat=n-1;
            while(nums[pivot]>=nums[nextGreat]){
               nextGreat--;
            }
            swap(nums,pivot,nextGreat);
        }

        reverse(nums,pivot+1,n-1);
    }

    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private static void reverse(int[] nums,int start,int end){
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
