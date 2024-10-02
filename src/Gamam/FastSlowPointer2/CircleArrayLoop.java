package Gamam.FastSlowPointer2;

public class CircleArrayLoop {

    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                continue;
            }

            int slow = i, fast = i;
            while (true) {
                slow = getNextIndex(nums, slow);
                fast = getNextIndex(nums, getNextIndex(nums, fast));

                // Check if they are in different directions or point to themselves
                if (nums[slow] * nums[i] < 0 || nums[fast] * nums[i] < 0 || slow == fast && slow == getNextIndex(nums, slow)) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }
            }

            // Mark all elements in this loop as visited
            int index = i;
            while (nums[index] * nums[i] > 0) {
                int nextIndex = getNextIndex(nums, index);
                nums[index] = 0; // Mark this index as visited by setting it to 0
                index = nextIndex;
            }
        }

        return false;
    }

    private int getNextIndex(int[] nums, int currentIndex) {
        int n = nums.length;
        int nextIndex = ((currentIndex + nums[currentIndex]) % n + n) % n; // Ensures positive index in case of negative mod result
        return nextIndex;
    }

    public static void main(String[] args) {
        CircleArrayLoop cal = new CircleArrayLoop();
        int[] nums = {2, -1, 1, 2, 2};
        System.out.println(cal.circularArrayLoop(nums));  // Output: true
    }
}

