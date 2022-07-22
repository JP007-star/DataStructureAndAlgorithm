package sort;/*
 * @project DataStructureAndAlgorithm
 * @fileName sort.BubbleSort
 * @author Jaya Prasad.M --> jaya_muthukrishnan
 * @email jaya_muthukrishnan@thbs.com
 * @date 15 12 2021 01:41 PM
 */

public class BubbleSort {
    public static void main(String[] args) {

        int arr[]={1,5,4,9,6,7,2,3};

        int result[]=bubbleSort(arr);

        for(int i=0;i<result.length;i++) {
            System.out.print(result[i]);
        }

    }

    private static int[] bubbleSort(int[] arr) {
        int last=arr.length-1;
        for(int i=0;i<=last;i++){

            for(int j=0;j<last-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}


///*
// * @project DataStructureAndAlgorithm
// * @fileName sort.BubbleSort
// * @author Jaya Prasad.M --> jaya_muthukrishnan
// * @email jaya_muthukrishnan@thbs.com
// * @date 15 12 2021 01:41 PM
// */
//
//import java.util.Scanner;
//
//public class sort.BubbleSort {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int arr[]={1,5,4,9,6,7,2,3};
//
//        int result[]=bubbleSort(arr);
//
//        // for(int i=0;i<result.length;i++) {
//        //     System.out.println(result[i]);
//        // }
//
//    }
//
//    private static int[] bubbleSort(int[] arr) {
//        int lastIndex=arr.length-1;
//        for (int i=0;i<lastIndex;i++){
//
//            for (int j=0;j<lastIndex;j++){
//
//                if(arr[j]>arr[j+1]){
//                    int temp =arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//
//            for(int k=0;k<arr.length;k++) {
//                System.out.print(arr[k]);
//            }
//            System.out.println();
//
//        }
//
//        return arr;
//    }
//}
