package string;

import java.util.*;

public class StringUtil {

    public boolean isPalindrome( String word){
        int start=0;
        int end=word.length()-1;
        char charArray[]=word.toCharArray();
         while(start < end){
             if(charArray[start] != charArray[end]){
                 return false;
             }
             start++;
             end--;
         }

       return true;
    }
    public String reverse(String word){
        char charArray[]=word.toCharArray();
        Stack<Character> stack=new Stack<>();

        for (char ch:charArray) {
            stack.push(ch);
        }
        for(int i=0;i<word.length();i++){
            charArray[i]=stack.pop();
        }

        return new String(charArray);
    }
    public boolean validSubSequence(String str,String seq){
        int i=0;
        int j=0;
        while (i<str.length() && j< seq.length()){
            if(str.charAt(i)==seq.charAt(j)){
                j++;
            }
            i++;
        }
        return j==seq.length();
    }
    public int firstNonRepeatingElement(String str){
        char charArray[]=str.toCharArray();
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for (char ch: charArray) {
            characterIntegerMap.put(ch,characterIntegerMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i< charArray.length;i++){
            char ch=charArray[i];
            if(characterIntegerMap.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
    public String removeVowel(String str){
         char charArray[]=str.toCharArray();
        Set<Character> vowels=new HashSet<>();
        StringBuilder stringBuilder=new StringBuilder();

        vowels.addAll(Arrays.asList(new Character[] {'a','e','i','o','u' }));

        for(int i=0;i<charArray.length;i++){
            if(!vowels.contains(charArray[i])){
                stringBuilder.append(charArray[i]);
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        StringUtil stringUtil=new StringUtil();
        System.out.println(stringUtil.isPalindrome("madam"));
        System.out.println(stringUtil.reverse("jaya"));
        System.out.println(stringUtil.validSubSequence("abcde","ccde"));
        System.out.println(stringUtil.firstNonRepeatingElement("adcsadc"));
        System.out.println(stringUtil.removeVowel("Jaya Prasad"));
    }


}
