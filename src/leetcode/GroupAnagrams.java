package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//Explanation:
//
//There is no string in strs that can be rearranged to form "bat".
//The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
public class GroupAnagrams {
  public static void main(String[] args) {
    GroupAnagrams g = new GroupAnagrams();
    String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> res = g.groupAnagrams(strs);
    for (List<String> list : res) {
      for (String str : list) {
        System.out.println(str);
      }
    }
  }

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    if (strs == null || strs.length == 0) {
      return new ArrayList<>();
    }

    for (String str : strs) {
      int[] count = new int[26];
      for (char c : str.toCharArray()) {
        count[c - 'a']++;
      }
      StringBuilder sb = new StringBuilder();
      for (int k : count) {
        sb.append(k).append("#");
      }
      String key = sb.toString();
      if (!map.containsKey(key) && !key.isEmpty()) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);

    }
    return new ArrayList<>(map.values());
  }
}