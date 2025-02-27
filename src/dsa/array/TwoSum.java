package dsa.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
        for (int i:
                twoSumII(nums,target)) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            int ans=target-nums[i];
            if(map.containsKey(ans)){
                result[0]=map.get(ans);
                result[1]=i;
            }

        }

        return result;
    }



    public static int[] twoSumII(int[] nums,int target){
        int left=0;
        int right= nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];

            if(sum==target){
                return new int[]{left+1,right+1};
            } else if (sum<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}

/*  https://www.scaler.com/topics/course/dsa-interviews-java/video/533/
 https://leetcode.com/problems/two-sum/

  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


  */
