package dsa.string;

public class Palindrome {
    public static void main(String[] args) {
        String text="madam";

        System.out.println("The given string is palindrome :: "+checkPalindrome(text));
    }

    private  static Boolean checkPalindrome(String str){
        char [] charArray=str.toCharArray();
        int startIndex=0;
        int endIndex=charArray.length-1;
        while (startIndex < endIndex){
            if(charArray[startIndex] != charArray[endIndex]){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
