package dsa.array;

public class RemoveEvenNumbersArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 1, 2, 2, 3};
        int[] result=removeEvenNumbers(nums1);
        for (int i = 0; i < result.length; i++) {
            System.out.print( result[i]+ " ");  // Output: 0 0 1 1 2 3 3
        }

    }

    public static  int[] removeEvenNumbers(int[] nums){
        int oddArrayCount=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2!=0){
                oddArrayCount++;
            }
        }
        int index=0;
        int[] result=new int[oddArrayCount];
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2!=0){
               result[index]=nums[i];
               index++;
            }
        }
        return result;

    }
}
