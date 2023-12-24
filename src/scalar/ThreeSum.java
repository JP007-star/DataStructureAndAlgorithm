package scalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4};
        for (List<Integer> i:
                threeSum(nums)) {
            System.out.println(i);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> integer = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if( i==0 || nums[i] != nums[i-1]){     // ignoring duplicates
                int j=i+1; int k=nums.length-1;    // set up two pointers
                while(j<k ){
                    if(nums[j]+nums[k]==0-nums[i]){                            // num2 + num3 = target-num1;
                        integer.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(nums[j]==nums[j+1]) j++;                         // ignoring duplicates
                        while(nums[k]==nums[k-1]) k--;                         // ignoring duplicates

                        j++;
                        k--;
                    }
                    else if (nums[j]+nums[k]<0-nums[i]){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
        return integer;
    }
}


//https://www.scaler.com/topics/course/dsa-interviews-java/video/534/
// https://leetcode.com/problems/3sum/
