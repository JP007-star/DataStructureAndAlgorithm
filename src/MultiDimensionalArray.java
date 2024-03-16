import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of col :");
        int col=scanner.nextInt();
        System.out.println("Enter no of row :");
        int row=scanner.nextInt();
        int [] [] multiDimensionalArray = new int[row][col];


        // storing
        for (int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the element");
                multiDimensionalArray[i][j]= scanner.nextInt();
            }
        }

        // display the elements
        for (int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                System.out.print(multiDimensionalArray[i][j]);
            }
        }

    }
}
