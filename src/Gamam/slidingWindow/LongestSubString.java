package Gamam.slidingWindow;


/*
Longest Substring Without Repeat
https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int windowStart=0;

        Map<Character,Integer> map=new HashMap<>();

        for(int pointer =0;pointer<s.length();pointer++){

            char currentChar=s.charAt(pointer);

            if(map.containsKey(currentChar) && map.get(currentChar) >= windowStart){
                windowStart=map.get(currentChar)+1;
            }

            map.put(currentChar,pointer);

            maxLength=Math.max(maxLength,pointer-windowStart+1);

        }


        return maxLength;
    }


    public static void main(String[] args) {

        LongestSubString longestSubString=new LongestSubString();
        System.out.println(longestSubString.lengthOfLongestSubstring("abcabaac"));
    }
}


