1) How do you strategize the test cases?
2) What do you mean test cases?
3) No requirements are provided
4) Application in front of you?
5) Does it stop you to do Basic sanity / smoke test cases?
 Reports - Test pass/failed




1)Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Plain Text
Input: strs = ["flower","flow","flight"]Output: "fl"
Example 2:
Plain Text
Input: strs = ["dog","racecar","car"]Output: ""Explanation: There is no common prefix among the input strings.




/*
Problem:

2)Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. (Two Sum)


3) finds repeated characters in a string and counts their occurrences using Java Streams.

i/p : "programming"

o/p : {g=2, r=2, m=2}


Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

*/
import java.util.*;

class Main {
public static void main(String[] args) {
List<Integer> nums = List.of(2, 7, 11, 15);
int target = 9;
sum(nums, target, 0, new ArrayList<>());
}

public static void sum(List<Integer> nums, int target, int start, List<Integer> result) {
if(target == 0){
System.out.println(result);
}
for(int i = start; i < nums.size(); i++) {
result.add(nums.get(i));
sum(nums, target - nums.get(i), i++, result);
result.remove(result.size() - 1);
}
}

}


Find the Second Largest Number

IP : {12, 35, 1, 10, 34, 1}
OP : 34

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Input: nums = [3,2,4], target = 6
Output: [1,2]


Given a List<Student>, use Java 8 Streams to determine, for each subject, the second-highest distinct mark scored among all students.

Input [2,6,3,1] => Output [18, 6, 12, 36]