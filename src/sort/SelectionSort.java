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
        for (int j=0; j< arr.length;j++) {
            int smallest = arr[j];
            int smallestIndex =j;
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest=arr[i];
                    smallestIndex = i;
                }
            }
           // System.out.println(smallest);
            int temp =arr[j];
            arr[j]=smallest;
            arr[smallestIndex]=temp;



        }
        return arr;
    }
}
