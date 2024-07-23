package Gamam.FastSlowPointer;

public class HappyNumber {

    public static void main(String[] args) {
        int number = 19;
        System.out.println(isHappy(number)); // Output: true
    }

    private static boolean isHappy(int number) {
        int slow=number;
        int fast=number;

        do{
            slow=sumOfSquare(slow);
            fast=sumOfSquare(sumOfSquare(fast));
        }
        while (slow!=fast);

        return slow==1;
    }

    private static int sumOfSquare(int n){
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
}

/*
https://leetcode.com/problems/happy-number/

 */
