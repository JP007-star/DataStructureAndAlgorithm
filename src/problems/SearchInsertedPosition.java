/* https://leetcode.com/problems/search-insert-position/
https://www.youtube.com/watch?v=O282KYvGkyc&list=PL6Zs6LgrJj3v9gBrV7xwiMod-EA3nMjWl&index=4
 */

package problems;

import java.util.Scanner;

public class SearchInsertedPosition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the target num to search:");
        int target= scanner.nextInt();
        int num_arr[]={-7,-3,2,3,11};
        int result=searchInsert(num_arr,target);
        System.out.println("Search Inserted Position : "+result);
    }
    public static int searchInsert(int[] num_arr, int target) {
        int firstIndex=0;
        int lastIndex=num_arr.length-1;

        while(firstIndex<=lastIndex){
            int mid=firstIndex+(lastIndex-firstIndex)/2;
            if(num_arr[mid]==target){
                return mid;
            }
            if(target<num_arr[mid]){
                lastIndex=mid-1;
            }
            else{
                firstIndex=mid+1;
            }
        }
        return firstIndex;
    }
}
