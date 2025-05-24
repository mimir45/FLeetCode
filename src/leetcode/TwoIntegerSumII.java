package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSumII {
    public static void main(String[] args) {
        int [] arr ={2,3,4};
        int target = 6;
        int [] res = twoSum(arr,target);
        for(int  num : res){
            System.out.println(num);
        }

    }
    public static int[] twoSum (int[] nums, int target){
        ArrayList<Integer> res = new ArrayList<>();


        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            if (nums[l] + nums[r] == target) {
                res.add(l+1);
                res.add(r+1);
                break;
            }
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                l++;
            }
        }


        return res.stream().mapToInt(x -> x).toArray();
    }
}
