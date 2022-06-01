/*** https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 * Author: Jaya Prasad .M
 * Email: justice_of_peace@yahoo.com
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 *
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 */



public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;
            else {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
        }
        if (count > maxCount) maxCount = count;
        return maxCount;
    }


}


