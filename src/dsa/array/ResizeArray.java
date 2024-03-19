package dsa.array;

public class ResizeArray {
    public static void main(String[] args) {
        int[] myArray = {5, 3, 9, 1, 7};
        int capacity=10;
        int[] result = reSizeArray(myArray,capacity);
        printArray(result);
    }

    private static int[] reSizeArray(int[] myArray,int capacity) {
        int[] temp= new int[capacity];

        for(int i=0;i<myArray.length;i++){
            temp[i] = myArray[i];
        }

        return  temp;

    }

    private static void  printArray(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]);
        }
    }


}
