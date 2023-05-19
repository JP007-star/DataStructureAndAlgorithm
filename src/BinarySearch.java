/*
 * @project DataStructureAndAlgorithm
 * @fileName BinarySearch
 * @author Jaya Prasad.M --> jaya_muthukrishnan
 * @email jaya_muthukrishnan@thbs.com
 * @date 14 12 2021 08:04 PM
 */

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]={-1,0,3,5,9,12};

        System.out.println("Enter a number you need to search:");

        int element=scanner.nextInt();

        int result=binarySearch(arr,element);

        if(result==(-1)){
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at the index: "+result);

    }

    private static int binarySearch(int[] nums, int target) {
        int startIndex=0;
        int endIndex=nums.length;

        while(startIndex<=endIndex){

            int pivot=startIndex+(endIndex-startIndex)/2;

            if(pivot<= nums.length-1) {

                if (nums[pivot] == target) return pivot;

                if (nums[pivot] < target) startIndex = pivot + 1;
                else endIndex = pivot - 1;
            }
            else return -1;


        }
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







