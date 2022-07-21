/* https://leetcode.com/problems/search-insert-position/
https://www.youtube.com/watch?v=O282KYvGkyc&list=PL6Zs6LgrJj3v9gBrV7xwiMod-EA3nMjWl&index=4
 */

package problems;

public class SearchInsertedPosition {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int firstIndex=0;
        int lastIndex=nums.length-1;

        while(firstIndex<=lastIndex){

            int mid=firstIndex+(lastIndex-firstIndex)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(target<nums[mid]){
                lastIndex=mid-1;
            }
            else{
                firstIndex=mid+1;
            }

        }

        return firstIndex;
    }
}
