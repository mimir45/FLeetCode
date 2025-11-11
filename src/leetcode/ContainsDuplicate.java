package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
    for(int i : nums) {
      if(set.contains(i)) {
        return true;
      }
      set.add(i);
    }
    return false;
  }

  public boolean containsDuplicate2(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : nums) {
      if(map.containsKey(i)) {
        return true;
      }
      map.put(i, 1);
    }
    return false;
  }
}