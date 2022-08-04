package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,23,54,66,4,7,28,45,87,24};
        int result[]=selectionSort(arr);

        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] selectionSort(int[] arr) {
        int last=arr.length-1;

        for(int i=0;i<=last;i++){
            int smallest=arr[i];
            int smallestIndex=i;
            for(int j=i+1;j<=last;j++){
                if(arr[j]<smallest){
                    smallest=arr[j];
                    smallestIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=smallest;
            arr[smallestIndex]=temp;
        }

        return arr;
    }
}
