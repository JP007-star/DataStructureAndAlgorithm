package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={1,7,-4,5,6};
        insertionSort(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }
    public static int[]  insertionSort(int[] arr){
        for(int i=1;i< arr.length;i++) {
            int temp = arr[i];
            int j=i-1;                  // sorted array position

            while(j>=0&& arr[j]>temp){
                arr[j+1]=arr[j];       // swapping ele in sorted array to unsorted array (/ shifting larger elements to temp by 1 pos)
                j--;
            }
            arr[j+1]=temp;
        }
        return  arr;
    }
}
