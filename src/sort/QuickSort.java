package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={1,7,4,5,6};
        sort(arr,0,arr.length-1);
        for (int i: arr) {
            System.out.println(i);
        }
    }



        public static int partition(int[] arr, int low, int high){
            int pivot = arr[high];
            int i =low;
            int j=low;

            while(i<=high){

                if (arr[i] <= pivot)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
                i++;
            }

            return j-1;
        }
        public static void  sort(int[] num_arr, int low, int high){
            if(low<high){
                int p=partition(num_arr,low,high);
                sort(num_arr,low,p-1);
                sort(num_arr,p+1,high);
            }
        }

}
