package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n ){
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        bactrack(0,0,n,res ,stack);
        return res;
    }
    public void bactrack(int open, int close,int n, List<String> res, StringBuilder stack ){
        if(open==close&& open== n ){
            res.add(stack.toString());
            return;
        }
        if (open<n){
            stack.append('(');
            bactrack(open+1,close,n,res,stack);
            stack.deleteCharAt(stack.length()-1);
        }
        if (close<open){
            stack.append(')');
            bactrack(open,close+1,n,res,stack);
            stack.deleteCharAt(stack.length()-1);
        }



    }


}
