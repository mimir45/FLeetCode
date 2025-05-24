package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums, target);
        for(int i:result){
            System.out.println(i);
        }

    }
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                list.add(map.get(temp));
                list.add(i);
            }
            map.put(nums[i],i);
        }


        return list.stream().mapToInt(i->i).toArray();
    }

}
