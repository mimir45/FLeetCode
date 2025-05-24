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
        for (char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty()&&stack.peek().equals(map.get(c))){
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
