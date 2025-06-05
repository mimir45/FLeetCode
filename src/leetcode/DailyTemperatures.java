package leetcode;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {

    }
    public static int [] dailyTemp(int []temps){
        int [] res = new int[temps.length];
        Stack<int[]> stack = new Stack<>();
        for (int i =   0 ; i<temps.length; i++){
            int  t = temps[i];
            while (!stack.isEmpty()&& stack.peek()[0] < t){
                int [] pair = stack.pop();
                res[pair[1]]= i-pair[1];
            }
            stack.push(new int []{t,i});
        }




        return  res ;
    }
}
