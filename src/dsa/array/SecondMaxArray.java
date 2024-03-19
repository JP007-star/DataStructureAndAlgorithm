package dsa.array;

public class SecondMaxArray {
    public static void main(String[] args) {
        int[] myArray = {5, 3, 9, 1, 7};
        int minValue = findSecondLargest(myArray);
        System.out.println("second Max value in the array: " + minValue);
    }

    public static int findSecondLargest(int[] myArray) {
        if (myArray.length < 2) {
            return -1; // No second largest element exists
        }
        int secondMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<myArray.length; i++) {
            if(myArray[i]>max){
                secondMax=max;
                max=myArray[i];
            }
            else if(myArray[i]>secondMax && myArray[i]!=max){
                secondMax=myArray[i];
            }
        }

        return secondMax != Integer.MIN_VALUE ? secondMax : -1; // Return -1 if no second largest element found
    }
}
