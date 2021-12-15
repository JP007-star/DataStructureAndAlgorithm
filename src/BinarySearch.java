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
        int arr[]={1,2,3,4,5,6,8,9};
        System.out.println("Enter a number you need to search:");
        int element=scanner.nextInt();
        int result=binarySearch(arr,element)+1;
        if(result==(-1)){
            System.out.println("Element not found");
        }
        else
            System.out.println("Element found at the index: "+result);

    }

    private static int binarySearch(int[] arr, int element) {
        int right= arr.length;
        int left=0;

        for(int i=0; i<=right;i++){

            int mid=(left+right)/2;

            if(arr[mid]==element){
               return mid;
           }

            if(arr[mid]<element){
               left=mid+1;
            }
            else right=mid-1;

        }
        return -1;
    }
}
