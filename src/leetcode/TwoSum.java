package leetcode;

import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    if (nums.length == 0 || nums.length == 1) {
      return new int[0];
    }
    //O(n^2) solution
//    for (int i = 0; i < nums.length - 1; i++) {
//      for (int j = i + 1; j < nums.length; j++) {
//        if (nums[i] + nums[j] == target) {
//          return new int[] {i, j};
//        }
//      }
//    }
    //Hashmap approach
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[] {map.get(target - nums[i]), i};
      } else {
        map.put(nums[i], i);
      }
    }

    return null;
  }


}