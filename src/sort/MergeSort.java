package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,7,4,5,6};
        sort(arr,new int[arr.length],0,arr.length-1);
        for (int i: arr) {
            System.out.println(i);
        }
    }
    public static void sort(int[] arr,int[] temp,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;  // to avoid overflow in integer max value

            sort(arr,temp,low,mid);         // sorting first half
            sort(arr,temp,mid+1,high);  // sorting second half

            merge(arr,temp,low,mid,high);
        }
    }
    public static void merge(int[] arr,int[] temp,int low,int mid,int high){
        // storing in temp array
        for(int i=low;i<=high;i++){
            temp[i]=arr[i];
        }
        int i = low; // traverse left sorted subarray
        int j = mid + 1; // traverse right sorted subarray
        int k = low; // will merge both arrays into original array (arr)

        while (i<=mid && j<=high){
            if(temp[i] <=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }

        // storing back to old array
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
    }
}
