package leetcode;

import java.util.Map;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        //Input: height = [1,7,2,5,4,7,3,6]
        //Output: 36
        int[] arr = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int [] heights){
        int result =Integer.MIN_VALUE;
        int l = 0 ;
        int r = heights.length-1;
        while (l<r){
            int distance = r-l;
            int square=  Math.min(heights[l] ,heights[r])*distance ;
            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
            result= Math.max(square ,result);

        }
        return  result;

    }
}
