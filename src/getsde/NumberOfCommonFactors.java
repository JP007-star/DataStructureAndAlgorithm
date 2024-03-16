package getsde;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        // Example usage
        int num1 = 12;
        int num2 = 18;

        int commonFactors = countCommonFactors(num1, num2);

        System.out.println("Number of common factors between " + num1 + " and " + num2 + ": " + commonFactors);

    }


    // Function to find the number of common factors of two integers
    public static int countCommonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }

}
