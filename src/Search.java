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
        Scanner scanner=new Scanner(System.in);

        int arr[]={1,2,4,5,6,8,9,3};

        System.out.println("Enter a number you need to search:");
        int element=scanner.nextInt();

        int result=linerSearch(arr,element);

        if(result==-1){
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at the index: "+result);
        
    }

    private static int linerSearch(int[] arr, int element) {
        int last=arr.length;
        for(int i=0;i<=last;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }


    private static int binarySearch(int[] arr, int target) {
        int startIndex=0;
        int endIndex=arr.length;

        while(startIndex<=endIndex){
            //0          6        0
            int pivot=startIndex+(endIndex-startIndex)/2;

            if(pivot<= arr.length-1) {   //-->  eliminating array out of bound exception  when call number not in array

                if (arr[pivot] == target) return pivot;

                if (arr[pivot] < target) startIndex = pivot + 1;
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
