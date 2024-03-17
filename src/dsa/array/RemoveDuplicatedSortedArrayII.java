package dsa.array;

public class RemoveDuplicatedSortedArrayII {
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = removeDuplicates(nums1);
        System.out.println(k1);  // Output: 5
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");  // Output: 1 1 2 2 3
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = removeDuplicates(nums2);
        System.out.println(k2);  // Output: 7
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");  // Output: 0 0 1 1 2 3 3
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        int current=2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[current-2]){
                nums[current]=nums[i];
                current++;
            }

        }
        return current;
    }
}
