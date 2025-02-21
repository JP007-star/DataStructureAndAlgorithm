/*
 * @project DataStructureAndAlgorithm
 * @fileName Search
 * @author Jaya Prasad.M --> jaya_muthukrishnan
 * @email jaya_muthukrishnan@thbs.com
 * @date 14 12 2021 06:23 PM
 */

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,3,5,6,8,9};
//        int[] arr = new int[1000];

//        System.out.println("Enter a number you need to search:");
//        int element = scanner.nextInt();
        int element = 9;

        int linerSearch = linerSearch(arr, element);
        int binarySearch = customSearch(arr, element);
        int result = searchUsingRecursive(arr, element,0,arr.length-1);


        if (linerSearch == -1) {
            System.out.println("Element Linear Search not found");
        } else
            System.out.println("Element  Linear Search found at the index: " + linerSearch);

        if (binarySearch == -1) {
            System.out.println("Element Binary Search not found");
        } else
            System.out.println("Element  Binary Search found at the index: " + binarySearch);

        if (result == -1) {
            System.out.println("Element Binary Search not found");
        } else
            System.out.println("Element  Binary Search found at the index: " + result);

    }

    private static int searchUsingRecursive(int[] arr, int element, int left, int right) {

        int steps=0;

        if(left<=right){
            steps++;
            int mid=(left+right)/2;
            if(arr[mid]==element){
                System.out.println("steps for recursive search :" + steps);
                return  mid;
            } else if (arr[mid]<=element) {
                return searchUsingRecursive(arr,element,mid+1,right);
            }
            else {
                return searchUsingRecursive(arr,element,left,mid-1);
            }
        }
        System.out.println("steps for recursive search :" + steps);

        return -1;
    }

    private static int linerSearch(int[] arr, int element) {
        int steps = 0;

        int last = arr.length;

        for (int i = 0; i < last; i++) {
            steps++;
            if (arr[i] == element) {
                System.out.println("steps for linear search :" + steps);
                return i;
            }
        }
        System.out.println("steps for linear search :" + steps);

        return -1;
    }


    private static int binarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length;

        int steps = 0;

        while (startIndex <= endIndex) {

            steps++;
            int pivot = startIndex + (endIndex - startIndex) / 2;

            if (pivot <= arr.length - 1) {   //-->  eliminating array out of bound exception  when call number not in array

                if (arr[pivot] == target) {
                    System.out.println("steps for binary search :" + steps);
                    return pivot;
                }
                if (arr[pivot] < target) {
                    startIndex = pivot + 1;
                } else {
                    endIndex = pivot - 1;
                }
            } else return -1;


        }
        System.out.println("steps for binary search :" + steps);

        return -1;
    }



    public static int customSearch(int[] arr,int target){

        int steps=0;
        int left=0;
        int right=arr.length-1;

        while (left <= right){
            steps++;


            int mid=(left+right)/2;

            if(arr[mid]==target){
                System.out.println("steps for custom search :" + steps);

                return mid;
            }

            else if(arr[mid] < target){
                left=mid+1;
            }
            else right=mid-1;
        }
        System.out.println("steps for binary search :" + steps);


        return -1;
    }
}



/*

 while (left <=right)


 mid =left+(right-left)/2

 if(nums[mid]== target)  return mid

 if nums[mid] <=target  left=pivot+1

 else  right=mid-1;


 */



/*
Let's analyze the time and space complexity for each function in your code:

### 1. Linear Search (`linerSearch` function)
- **Time Complexity**: O(n)
  - In the worst case, the function needs to check each element in the array, resulting in a linear time complexity.
- **Space Complexity**: O(1)
  - The function uses a constant amount of extra space, regardless of the input size.

### 2. Binary Search (`binarySearch` function)
- **Time Complexity**: O(log n)
  - The function repeatedly divides the search interval in half, resulting in a logarithmic time complexity.
- **Space Complexity**: O(1)
  - The function uses a constant amount of extra space, regardless of the input size.

### 3. Recursive Binary Search (`searchUsingRecursive` function)
- **Time Complexity**: O(log n)
  - Similar to the iterative binary search, the function divides the search interval in half, resulting in a logarithmic time complexity.
- **Space Complexity**: O(log n)
  - The function uses extra space for the call stack due to recursion. In the worst case, the depth of the recursion tree is log n.

### 4. Custom Binary Search (`customSearch` function)
- **Time Complexity**: O(log n)
  - This function is essentially the same as the iterative binary search, with a logarithmic time complexity.
- **Space Complexity**: O(1)
  - The function uses a constant amount of extra space, regardless of the input size.

### Best Algorithm
For searching in a sorted array, the **binary search** (both iterative and recursive) is the best algorithm due to its logarithmic time complexity, which is significantly faster than linear search for large arrays. Between the iterative and recursive binary search, the iterative version is generally preferred because it has a lower space complexity (O(1) vs. O(log n)).

So, the **iterative binary search** (`binarySearch` function) is the best choice for this use case.
 */
