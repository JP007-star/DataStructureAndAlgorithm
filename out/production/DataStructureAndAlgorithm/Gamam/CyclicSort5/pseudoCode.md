**Cyclic Sort** is a sorting algorithm designed to work on problems where the input array consists of numbers in a specific range, such as `1 to n`. The idea behind Cyclic Sort is to place each element at its correct position in one pass through the array by swapping misplaced elements.

### General Approach:
- For an array where the numbers range from `1 to n` and the array has a length of `n`, the correct position for any number `x` is `x-1` (i.e., number `1` should be at index `0`, number `2` at index `1`, and so on).
- We iterate through the array, and for each element, if it's not in its correct position, we swap it with the element at its correct position. This continues until all elements are correctly placed.

---

### Problem:
Sort an array of numbers ranging from `1` to `n` using Cyclic Sort.

### Input:
- An array `arr` of integers where each integer is in the range `1 to n`.

### Output:
- The array sorted in ascending order.

---

### Pseudocode:

```
function cyclicSort(arr):
    i = 0

    // Iterate through the array
    while i < length of arr:
        // Calculate the correct index for the current element
        correctIndex = arr[i] - 1

        // If the current element is not in its correct position, swap it
        if arr[i] != arr[correctIndex]:
            // Swap arr[i] with arr[correctIndex]
            swap(arr[i], arr[correctIndex])
        else:
            // If the element is already in the correct position, move to the next element
            i += 1

    // Return the sorted array
    return arr
```

---

### Explanation:

1. **Iteration**: The algorithm starts at the first index (`i = 0`) and iterates through the array.
2. **Correct Index Check**: For each element `arr[i]`, we calculate its correct index as `arr[i] - 1` (since the array is zero-indexed). If the element is not at its correct index, it is swapped with the element at the correct index.
3. **Swap**: If `arr[i]` is not at the correct position, swap it with the element that belongs in index `i`. This continues until every element is in its correct position.
4. **Move Pointer**: Once an element is in its correct place, we move the pointer `i` to the next index. The process repeats until the entire array is sorted.

### Time Complexity:
- **O(n)**: Each element is checked and placed in its correct position at most once. Thus, the overall time complexity is O(n).

### Space Complexity:
- **O(1)**: The algorithm operates in-place, so no additional space is used except for a few variables.

---

### Example:

**Input**:
```
[3, 1, 5, 4, 2]
```

**Steps**:
1. Start with `i = 0`, `arr[0] = 3`. Its correct index is `2`. Swap `arr[0]` with `arr[2]`:  
   `arr = [5, 1, 3, 4, 2]`
2. `arr[0] = 5`, its correct index is `4`. Swap `arr[0]` with `arr[4]`:  
   `arr = [2, 1, 3, 4, 5]`
3. `arr[0] = 2`, its correct index is `1`. Swap `arr[0]` with `arr[1]`:  
   `arr = [1, 2, 3, 4, 5]`
4. `arr[0] = 1`, it's in the correct position. Move to the next element (`i = 1`).
5. `arr[1] = 2`, correct position. Continue, `arr[2] = 3`, correct position, and so on.
6. The array is now sorted.

**Output**:
```
[1, 2, 3, 4, 5]
```

---

### Common Use Cases for Cyclic Sort:
- **Finding Missing Numbers**: After sorting, if an element is out of place, it may indicate a missing number.
- **Finding Duplicate Numbers**: While sorting, if an element is already at its correct position and you're trying to place another element there, it can be identified as a duplicate.

The cyclic sort works efficiently on arrays where the elements are bounded within a specific range, making it an excellent choice for certain problems.