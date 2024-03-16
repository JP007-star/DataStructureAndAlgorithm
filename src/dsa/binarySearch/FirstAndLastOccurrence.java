package dsa.binarySearch;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = searchRange(nums1, target1);
        System.out.println("Example 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = searchRange(nums2, target2);
        System.out.println("Example 2: [" + result2[0] + ", " + result2[1] + "]");

    }


    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Search for the starting position
        result[0] = findFirstOccurrence(nums, target);

        // If the starting position is found, search for the ending position
        if (result[0] != -1) {
            result[1] = findLastOccurrence(nums, target);
        }

        return result;
    }

    private static int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    result = mid;
                }
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private static int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    result = mid;
                }
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    /* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ */
}
