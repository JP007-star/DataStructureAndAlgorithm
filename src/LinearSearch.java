/*
 * @project DataStructureAndAlgorithm
 * @fileName LinearSearch
 * @author Jaya Prasad.M --> jaya_muthukrishnan
 * @email jaya_muthukrishnan@thbs.com
 * @date 14 12 2021 06:23 PM
 */

import java.util.Scanner;

public class LinearSearch {
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
}
