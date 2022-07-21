/*
https://leetcode.com/problems/valid-parentheses/

https://www.youtube.com/watch?v=9TVrlVAtpv8&list=PL6Zs6LgrJj3v9gBrV7xwiMod-EA3nMjWl&index=6
 */
package problems;

import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        String parenthesis="()]";
        boolean result=isValid(parenthesis);
        System.out.println(result);
    }
        public static boolean isValid(String s) {
            Stack<Character> stack=new Stack<>();
            for(char c:s.toCharArray()){
                if(c =='{' || c=='(' || c=='['){
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    else{
                        char top=stack.peek();
                        if((c =='}' && top=='{')|| (c==')' && top=='(') || (c==']' && top=='[')){
                            stack.pop();
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }

}
