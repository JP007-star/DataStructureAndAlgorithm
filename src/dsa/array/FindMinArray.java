package dsa.array;


public class FindMinArray {
    public static void main(String[] args) {
        int[] myArray = {5, 3, 9, 1, 7};
        int minValue = findMin(myArray);
        System.out.println("Minimum value in the array: " + minValue);
    }

    private static int findMin(int[] myArray) {
        int min=myArray[0];
        for (int i=0; i<myArray.length; i++) {
            if(myArray[i] < min) {
                min=myArray[i];
            }
        }
        return min;
    }
}
