package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));


    }
    public  static  boolean isValid(String s){
        Stack<Character> stack= new Stack<>();
        Map<Character,Character> map= new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for (int i =0;i<s.length();i++) {
            if (stack.peek() == map.get(s.charAt(i))) {
                stack.pop();
            }
            stack.push(s.charAt(i));
        }


        return stack.isEmpty();
    }
}
