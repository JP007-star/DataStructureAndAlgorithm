### General Approach for Solving "Two Heap" Problems in DSA

The **Two Heaps** approach is commonly used to solve problems where you need to efficiently track and calculate the **median** or similar order statistics dynamically, as new elements are added to a data stream. The key idea is to use two heaps to maintain order in a way that allows for quick access to the median or other statistics.

Here’s a structured approach for solving two-heap-based problems:

---

### 1. **Understand the Use of Two Heaps**

You typically use two heaps:
- **Max-Heap**: To store the smaller half of the numbers.
- **Min-Heap**: To store the larger half of the numbers.

The heaps help in maintaining balance such that:
- The **Max-Heap** (small half) always has the largest element from the smaller half of the numbers.
- The **Min-Heap** (large half) always has the smallest element from the larger half of the numbers.

This structure allows quick retrieval of the median:
- If the total number of elements is **odd**, the root of the heap with more elements is the median.
- If the total number is **even**, the median is the average of the two roots of the heaps.

---

### 2. **General Steps to Implement the Two Heap Approach**

1. **Choose Two Data Structures**:
    - Use a **Max-Heap** for the smaller half of the numbers.
    - Use a **Min-Heap** for the larger half of the numbers.

2. **Balancing the Heaps**:
    - The size of the Max-Heap should either be equal to or one more than the Min-Heap.
    - After every insertion, ensure that the heaps remain balanced (the difference in their sizes should be at most 1).

3. **Insertion Process**:
    - Add the new element to one of the heaps, depending on the value.
    - If the new element is smaller than the largest element of the Max-Heap, it goes into the Max-Heap.
    - Otherwise, it goes into the Min-Heap.
    - After insertion, rebalance the heaps if necessary (if one heap is larger than the other by more than 1).

4. **Finding the Median**:
    - If both heaps are of the same size, the median is the average of the two roots (top elements of the heaps).
    - If one heap has more elements, the root of that heap is the median.

---

### 3. **Common Two-Heap Problems**

#### 1. **Median of a Stream of Numbers**

**Problem**: Given a stream of numbers, you are tasked with finding the median as new elements are added.

**Approach**:
- Use two heaps: a **Max-Heap** for the lower half and a **Min-Heap** for the upper half.
- Insert each new element into the appropriate heap.
- Rebalance the heaps so that the size difference between them is no more than 1.
- The median is either the root of the Max-Heap (if Max-Heap has more elements) or the average of the two heap roots (if both heaps have the same size).

**Java Code**:

```java
import java.util.PriorityQueue;

class MedianFinder {
    // Max-heap to store the smaller half of the numbers
    private PriorityQueue<Integer> maxHeap;
    
    // Min-heap to store the larger half of the numbers
    private PriorityQueue<Integer> minHeap;

    /** Initialize your data structure. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max-heap (descending order)
        minHeap = new PriorityQueue<>();                // Min-heap (ascending order)
    }

    /** Adds a number into the data structure. */
    public void addNum(int num) {
        // Add the number to the max-heap (smaller half)
        maxHeap.offer(num);

        // Ensure the largest number in max-heap is smaller than the smallest number in min-heap
        minHeap.offer(maxHeap.poll());

        // Rebalance the heaps if necessary, so max-heap can hold one more element than min-heap
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    /** Returns the median of current data stream. */
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek(); // Odd number of elements, max-heap holds the median
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0; // Even number of elements, average of roots
        }
    }
}
```

### Key Steps:
- **Insertion**: Insert the new number into the Max-Heap first, then move the largest number of Max-Heap to Min-Heap to maintain order.
- **Rebalance**: If the size of Min-Heap exceeds Max-Heap, move the smallest element from Min-Heap to Max-Heap.
- **Median Calculation**: If Max-Heap has more elements, its root is the median. If both heaps are equal, the median is the average of the roots.

---

#### 2. **Sliding Window Median**

**Problem**: Given an array of numbers and a sliding window of size `k`, find the median for each window as it slides from left to right.

**Approach**:
- Use the **two heap method** to maintain the sliding window of size `k`.
- Insert elements as they enter the window and remove elements as they exit the window.
- Keep the heaps balanced, just like in the median of a stream problem.
- After processing each window, the median is derived from the heaps.

**Java Code**:

```java
import java.util.Collections;
import java.util.PriorityQueue;

class SlidingWindowMedian {
    private PriorityQueue<Integer> maxHeap; // Lower half (max-heap)
    private PriorityQueue<Integer> minHeap; // Upper half (min-heap)

    public SlidingWindowMedian() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap
        minHeap = new PriorityQueue<>(); // Min-Heap
    }

    // Function to add a number to the correct heap
    private void addNum(int num) {
        maxHeap.add(num); // Add to maxHeap first
        minHeap.add(maxHeap.poll()); // Move the largest from maxHeap to minHeap

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll()); // Balance the heaps if minHeap is larger
        }
    }

    // Function to remove a number from the appropriate heap
    private void removeNum(int num) {
        if (maxHeap.contains(num)) {
            maxHeap.remove(num);
        } else {
            minHeap.remove(num);
        }
        // Rebalance the heaps after removal
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            addNum(nums[i]); // Add new element to heaps

            // Once the window reaches size k, compute the median
            if (i >= k - 1) {
                if (maxHeap.size() > minHeap.size()) {
                    result[i - k + 1] = maxHeap.peek(); // Median if odd
                } else {
                    result[i - k + 1] = (maxHeap.peek() + minHeap.peek()) / 2.0; // Median if even
                }

                // Remove the element going out of the window
                removeNum(nums[i - k + 1]);
            }
        }
        return result;
    }
}
```

### Key Steps:
- **Insert**: Each new element is inserted using the same approach as the regular two-heap method.
- **Remove**: Efficiently remove the outgoing element from the appropriate heap and rebalance.
- **Median Calculation**: For each window, calculate the median just like the median of a stream.

---

### 4. **Key Concepts to Keep in Mind**
- **Heap Properties**: Max-Heap and Min-Heap properties allow you to efficiently find the largest of the smaller half and the smallest of the larger half, helping in quick median calculation.
- **Balancing**: Always make sure the heaps are balanced, i.e., the size difference between the two heaps is at most 1.
- **Rebalancing After Insertions and Removals**: After each insertion and removal, rebalance the heaps if the size difference exceeds 1.

### 5. **Common Edge Cases**
- The array or stream is empty.
- The stream or array contains negative numbers, duplicates, or extreme values.
- Sliding window with fewer elements than `k` or no median if window size is larger than the array.
- Odd vs even number of elements in terms of median calculation.

By following these general steps, the Two-Heap approach can efficiently solve dynamic median or similar problems.