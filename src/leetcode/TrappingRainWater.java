package leetcode;

import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] heights ={0,2,0,3,1,0,1,3,2,1};
        int res = trap(heights);
        System.out.println( res);

    }
    public static int trap(int[] height){

        if (height.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int res = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int mid = height[stack.pop()];
                if (!stack.isEmpty()) {
                    int right = height[i];
                    int left = height[stack.peek()];
                    int h = Math.min(right, left) - mid;
                    int w = i - stack.peek() - 1;
                    res += h * w;
                }
            }
            stack.push(i);
        }
        return res;
//        if (height == null || height.length == 0) {
//            return 0;
//        }
//
//        int l = 0, r = height.length - 1;
//        int leftMax = height[l], rightMax = height[r];
//        int res = 0;
//        while (l < r) {
//            if (leftMax < rightMax) {
//                l++;
//                leftMax = Math.max(leftMax, height[l]);
//                res += leftMax - height[l];
//            } else {
//                r--;
//                rightMax = Math.max(rightMax, height[r]);
//                res += rightMax - height[r];
//            }
//        }


    }
}

