package dsa.array;

import java.util.*;

public class IntersectionOfArray {
    public static void main(String[] args) {


        // Test cases
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));  // Output: [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));  // Output: [9, 4]

        // Example 1
        int[] nums_1 = {1, 2, 2, 1};
        int[] nums_2 = {2, 2};
        int[] intersection1 = intersect(nums_1, nums_2);
        System.out.println("Example 1: " + Arrays.toString(intersection1)); // Output: [2, 2]

        // Example 2
        int[] nums_3 = {4, 9, 5};
        int[] nums_4 = {9, 4, 9, 8, 4};
        int[] intersection2 = intersect(nums_3, nums_4);
        System.out.println("Example 2: " + Arrays.toString(intersection2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Create a set to store the intersection of elements
        Set<Integer> intersection = new HashSet<>();

        // Iterate through set1 and check if each element exists in set2
        for (int num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Map to store frequency of elements in nums1
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();
        // Iterate through nums2 and check for common elements
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersectionList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }

        return result;
    }
}
