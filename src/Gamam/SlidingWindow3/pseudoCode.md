The **Sliding Window** technique is a powerful method for solving problems involving contiguous subarrays or substrings, where the goal is to find a specific property (like maximum sum, minimum length, etc.) over a window of fixed or variable size.

Here’s the general pseudocode structure for solving sliding window problems:

---

### Problem 1: Maximum Sum of a Subarray of Fixed Size (K)
Find the maximum sum of any subarray of length `k` in an array.

### Input:
- An array `arr` of integers
- An integer `k` representing the size of the window

### Output:
- The maximum sum of any subarray of size `k`

### Pseudocode:

```
function maxSubArraySum(arr, k):
    // Initialize variables for window sum and max sum
    windowSum = 0
    maxSum = -infinity

    // First, calculate the sum of the first window
    for i = 0 to k - 1:
        windowSum += arr[i]

    // Set maxSum as the sum of the first window
    maxSum = windowSum

    // Slide the window from the start of the array to the end
    for i = k to length of arr - 1:
        // Slide the window by removing the element going out of the window and adding the new element
        windowSum = windowSum - arr[i - k] + arr[i]

        // Update maxSum if the new window sum is greater
        maxSum = max(maxSum, windowSum)

    return maxSum
```

---

### Problem 2: Smallest Subarray with Sum Greater than or Equal to Target (Variable Size Window)
Given an array of positive integers, find the minimal length of a contiguous subarray of which the sum is greater than or equal to a given target.

### Input:
- An array `arr` of integers
- An integer `target`

### Output:
- The minimum length of the subarray whose sum is greater than or equal to the target

### Pseudocode:

```
function minSubArrayLength(arr, target):
    // Initialize pointers and variables
    windowSum = 0
    minLength = infinity
    start = 0

    // Slide the window with the right pointer
    for end = 0 to length of arr - 1:
        // Add the current element to the window sum
        windowSum += arr[end]

        // Shrink the window from the left while the sum is greater than or equal to the target
        while windowSum >= target:
            // Calculate the window size
            windowLength = end - start + 1

            // Update the minimum length
            minLength = min(minLength, windowLength)

            // Remove the element going out of the window
            windowSum -= arr[start]
            start += 1

    // If no valid subarray was found, return 0
    if minLength == infinity:
        return 0
    else:
        return minLength
```

---

### Problem 3: Longest Substring with K Distinct Characters (Variable Size Window)
Find the length of the longest substring with at most `k` distinct characters.

### Input:
- A string `s`
- An integer `k` representing the number of distinct characters

### Output:
- The length of the longest substring that contains at most `k` distinct characters

### Pseudocode:

```
function longestSubstringWithKDistinct(s, k):
    // Initialize pointers and variables
    start = 0
    maxLength = 0
    charFrequencyMap = empty map

    // Slide the window with the right pointer
    for end = 0 to length of s - 1:
        // Add the current character to the map
        charFrequencyMap[s[end]] += 1

        // Shrink the window until the number of distinct characters is <= k
        while size of charFrequencyMap > k:
            charFrequencyMap[s[start]] -= 1

            // If the frequency of a character becomes 0, remove it from the map
            if charFrequencyMap[s[start]] == 0:
                remove s[start] from charFrequencyMap

            start += 1

        // Calculate the window size and update maxLength
        maxLength = max(maxLength, end - start + 1)

    return maxLength
```

---

### Problem 4: Maximum of All Subarrays of Size K (Fixed Size Sliding Window)
Given an array and a window size `k`, find the maximum value in each subarray of size `k`.

### Input:
- An array `arr` of integers
- An integer `k` representing the size of the window

### Output:
- An array of the maximum values for each sliding window of size `k`

### Pseudocode:

```
function maxSlidingWindow(arr, k):
    result = empty list
    deque = empty deque // will store indices of array elements

    for i = 0 to length of arr - 1:
        // Remove indices of elements not in the current window
        if deque is not empty and deque[0] <= i - k:
            deque.pop_front()

        // Remove elements from the deque that are smaller than the current element
        while deque is not empty and arr[deque.back()] <= arr[i]:
            deque.pop_back()

        // Add the current element at the back of the deque
        deque.push_back(i)

        // If we have processed at least k elements, add the max element (front of deque) to the result
        if i >= k - 1:
            result.append(arr[deque.front()])

    return result
```

---

### Key Concepts of Sliding Window:

1. **Fixed-size Window**: The window slides by removing one element from the left and adding one element from the right.
    - Examples: Maximum sum of subarray of size `k`, maximum element in subarray of size `k`.

2. **Variable-size Window**: The window grows by expanding the right end until the condition is met, and shrinks by moving the left end to optimize the solution.
    - Examples: Smallest subarray with sum >= `target`, longest substring with at most `k` distinct characters.

3. **Optimizations**: Use hash maps, frequency counters, or deques to efficiently manage the elements in the sliding window.

This technique helps in solving a wide range of problems efficiently in O(n) time complexity.