package problems;
/*
https://www.youtube.com/watch?v=w-qeVOijccg&list=PL6Zs6LgrJj3v9gBrV7xwiMod-EA3nMjWl&index=11
https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int result[]=productArrayExceptSelf(nums);
        for (int num:result) {
            System.out.println(num);
        }
    }

    private static int[] productArrayExceptSelf(int[] nums) {
        int temp=1;
        int[] result=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            result[i]=temp;
            temp*=nums[i];
        }
        temp=1;
        for(int i= nums.length-1;i>=0;i--){
            result[i]*=temp;
            temp*=nums[i];
        }
        return  result;
    }
}
