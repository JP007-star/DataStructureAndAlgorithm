package problems;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int nums[]={-7,-3,2,3,11};
        int result[]=nextGreaterElements(nums);
        for (int num:nums) {
            System.out.println(num);
        }
    }
    public static int[] nextGreaterElements(int[] num_arr) {
        int[] res = new int[num_arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * num_arr.length - 1; i >= 0; --i) {

            while (!stack.empty() && num_arr[stack.peek()] <= num_arr[i % num_arr.length]) {
                stack.pop();
            }
            res[i % num_arr.length] = stack.empty() ? -1 : num_arr[stack.peek()];
            stack.push(i % num_arr.length);
        }
        return res;
    }
}
