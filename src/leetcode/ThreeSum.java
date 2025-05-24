package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        int []nums={0,0,0};
        //[[-1,-1,2],[-1,0,1]]
        List<List<Integer>> res = threeSum(nums);

      res.stream().flatMap(List::stream).forEach(System.out::println);

    }


    public static List<List<Integer>> threeSum (int []nums){
        // i = - (r+l);
        List<List<Integer>> res  = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i <nums.length ; i++) {
            int r= nums.length-1;

            if(nums[i]>0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i+1;

            int sum =nums[r]+nums[l]+nums[i];

            while (l<r){
                if(sum >0){
                    r--;
                }else if(sum<0){
                 l++;
                }else {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
