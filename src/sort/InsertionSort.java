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
        int size=arr.length;
        for (int step = 1; step < size; step++) {
            int key = arr[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].


            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            arr[j + 1] = key;

        }
        return  arr;
    }
}
