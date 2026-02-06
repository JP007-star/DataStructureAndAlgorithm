# 🔢 Java Coding Problems – Interview Prep Notes

---

## 1️⃣ Fibonacci Series

```java
public static void fibonacci() {
    int terms = 11;
    int first = 0;
    int second = 1;

    for (int i = 1; i < terms; i++) {
        System.out.print(first + " ");
        int res = first + second;
        first = second;
        second = res;
    }
}
```

---

## 2️⃣ Palindrome Number

```java
public static void palindrome(String[] args) {
    int n = 121;
    int origin = n;
    int rev = 0;

    while (n != 0) {
        int digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;
    }

    System.out.println(rev);
}
```

---

## 3️⃣ Two Sum (Using HashMap)

🔗 [https://leetcode.com/problems/two-sum/](https://leetcode.com/problems/two-sum/)

```java
public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int rem = target - nums[i];

        if (map.containsKey(rem)) {
            return new int[]{map.get(rem), i};
        }

        map.put(nums[i], i);
    }

    return new int[]{};
}
```

---

## 3️⃣ Two Sum II (Two Pointers – Sorted Array)

```java
public int[] twoSum(int[] numbers, int target) {

    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {

        int sum = numbers[left] + numbers[right];

        if (sum == target) {
            return new int[]{left + 1, right + 1}; // 1-based index
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    return new int[]{-1, -1};
}
```

---

## 4️⃣ Reverse String (In-Place)

🔗 [https://leetcode.com/problems/reverse-string/](https://leetcode.com/problems/reverse-string/)

```java
public void reverseString(char[] s) {

    int left = 0;
    int right = s.length - 1;

    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;
    }
}
```

---

## 5️⃣ Valid Palindrome

🔗 [https://leetcode.com/problems/valid-palindrome/](https://leetcode.com/problems/valid-palindrome/)

```java
public boolean isPalindrome(String s) {

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {

        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }

        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        if (Character.toLowerCase(s.charAt(left)) !=
            Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        left++;
        right--;
    }

    return true;
}
```

---

## 6️⃣ Move Zeroes

🔗 [https://leetcode.com/problems/move-zeroes/](https://leetcode.com/problems/move-zeroes/)

```java
public void moveZeroes(int[] nums) {

    int slow = 0;

    for (int fast = 0; fast < nums.length; fast++) {
        if (nums[fast] != 0) {
            nums[slow] = nums[fast];
            slow++;
        }
    }

    while (slow < nums.length) {
        nums[slow] = 0;
        slow++;
    }
}
```

---

## 7️⃣ Remove Element

🔗 [https://leetcode.com/problems/remove-element/](https://leetcode.com/problems/remove-element/)

```java
public int removeElement(int[] nums, int val) {

    int slow = 0;

    for (int fast = 0; fast < nums.length; fast++) {
        if (nums[fast] != val) {
            nums[slow] = nums[fast];
            slow++;
        }
    }

    return slow;
}
```

---

## 8️⃣ Minimum Size Subarray Sum (Sliding Window)

```java
public int minLength(int[] nums, int k) {

    int start = 0;
    int sum = 0;
    int minLen = Integer.MAX_VALUE;

    for (int end = 0; end < nums.length; end++) {
        sum += nums[end];

        while (sum >= k) {
            minLen = Math.min(minLen, end - start + 1);
            sum -= nums[start];
            start++;
        }
    }

    return minLen;
}
```

---

## 9️⃣ Swap Two Numbers Without Temporary Variable

```java
public class SwapWithoutVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
```

---

## 🔟 Best Time to Buy and Sell Stock

🔗 [https://leetcode.com/problems/best-time-to-buy-and-sell-stock/](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

```java
public int maxProfit(int[] prices) {

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else {
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
    }

    return maxProfit;
}
```

---

## 11 Grouping Using Java Streams

```java
repo.findAll()
    .stream()
    .collect(Collectors.groupingBy(
        emp -> emp.getAge(),
        TreeMap::new,
        Collectors.toSet()
    ));
```

---

## 12 Find Duplicate Elements Using Streams

```java
import java.util.*;
import java.util.stream.*;

public class DuplicateExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates); // [1, 2]
    }
}
```


