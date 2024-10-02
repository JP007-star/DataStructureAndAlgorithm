package Gamam.TwoSum1;

/*
https://leetcode.com/problems/trapping-rain-water/
 */

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height)); // Output: 6
    }

    private static int trap(int[] height) {
        int left=0;
        int right= height.length-1;
        int waterTrapped=0;
        int leftMax=0;
        int rightMax=0;


        while (left<right){
            if(height[left]<height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            }
            else{
                if(height[right]>rightMax){
                    rightMax=height[right];
                }
                else {
                    waterTrapped+=rightMax-height[right];
                }
                right--;
            }

        }

        return waterTrapped;
    }

}


/*
Steps to Solve the Problem
Step 1: Initial Setup
Pointers: Initialize two pointers, left at the beginning (index 0) and right at the end (index n-1) of the array.
Max Heights: Use two variables, left_max and right_max, to keep track of the maximum height encountered so far from the left and the right.
Water Trapped: Initialize a variable waterTrapped to accumulate the total amount of water trapped.
Step 2: Traverse the Array with Two Pointers
Use a while loop to iterate through the array until left is less than right.
Step 3: Calculate Water Trapped
At each step, compare the heights at the left and right pointers.
Depending on which side is shorter, update the max height for that side and calculate the water trapped based on the difference between the max height and the current height.
 */
