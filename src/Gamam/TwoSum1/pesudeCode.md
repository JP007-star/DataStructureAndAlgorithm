Here is a pseudocode for solving two-sum problems using a hash map (which allows you to solve it in linear time):

### Problem:
Given an array of integers, find two numbers that add up to a target sum.

### Input:
- An array of integers `nums`
- An integer `target`

### Output:
- Indices of the two numbers that add up to the target sum.

### Pseudocode:

```
function twoSum(nums, target):
    // Create an empty hash map (dictionary) to store the numbers and their indices
    hashMap = {}

    // Iterate through the array
    for i = 0 to length of nums - 1:
        // Calculate the complement that we need to add up to the target
        complement = target - nums[i]

        // Check if the complement exists in the hash map
        if complement exists in hashMap:
            // If it exists, return the index of the complement and the current index
            return [hashMap[complement], i]

        // If it doesn't exist, add the current number and its index to the hash map
        hashMap[nums[i]] = i

    // If no solution is found, return an empty array (or an indication of failure)
    return []
```

### Explanation:
1. **Hash map storage**: As you iterate through the array, you store each number and its index in a hash map.
2. **Complement calculation**: For each number, you compute the difference between the target and the current number.
3. **Check existence**: If the complement (the other number needed) is already in the hash map, you return the current index and the index of the complement.
4. **Time Complexity**: The algorithm runs in O(n) time, where n is the length of the array, because each lookup and insertion in the hash map takes O(1) time.

This pseudocode will solve the two-sum problem efficiently.