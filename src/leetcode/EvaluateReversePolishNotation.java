package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String []tokens= {"1","2","+","3","*","4","-"};
        System.out.println(evalPRN(tokens));

    }
    public static int evalPRN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for (String c:tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(c.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }else if(c.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(c.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }else stack.push(Integer.parseInt(c));
        }
        return stack.peek();
    }
}
