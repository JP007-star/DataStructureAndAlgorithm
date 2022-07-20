package problems;


public class RearrangeSortedMaxMin {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,8,9};
        int result[]=arrangeArray(arr);
        for (int i:
             result) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static   int[] arrangeArray(int[] arr){
        int maxIdx=arr.length-1;
        int minIdx=0;
        int max=arr[maxIdx]+1;

        for(int i=0;i< arr.length;i++){
           if(i%2==0){
               arr[i]=arr[i]+(arr[maxIdx]%max)*max;
               maxIdx--;
           }
           else{
               arr[i]=arr[i]+(arr[minIdx]%max)*max;
               minIdx++;
           }
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=arr[i]/max;
        }
        return arr;
    }
}
/*
https://www.interviewbit.com/blog/rearrange-array-alternately/
*/

