/****
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Squares of a Sorted Array
 *
 * Solution
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class SquareOfSortedArray {
    public static void main(String[] args) {
        int nums[]={-7,-3,2,3,11};
        int result[]=squareOfSortedArray(nums);
        for (int num:result) {
            System.out.println(num);
        }

    }

    private static int[] squareOfSortedArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];

        }
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }
        return nums;
    }
}
