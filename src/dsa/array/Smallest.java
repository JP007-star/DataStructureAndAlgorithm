package dsa.array;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
        System.out.println(solution(n));
    }


    public static  int solution(int n){

        String ans="";
        for (int i=9; i>=2; i--){
            while (n%i==0){
                n/=i;
                ans=i+ans;
            }
        }
        if (n!=1)
        return  -1 ;
        else {
            return Integer.parseInt(ans);
        }
    }




    /*
    https://www.scaler.com/topics/course/dsa-interviews-java/video/593/

    Smallest Number Whose Product Of Digits Is N
Given a positive number N. You need to find the smallest number 5 such that product of digits of S is equal to N.
Sample input
N-1000
Sample Output
(10 10)
5558 */


}





