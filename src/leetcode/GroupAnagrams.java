package leetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        /*
         * Input: strs = ["act","pots","tops","cat","stop","hat"]
         * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
         * */
        Map<String,List<String>> map = new HashMap<>();
       for(String s:strs){
           int []charset =new int[26];
           for(char c:s.toCharArray()){
               charset[c-'a']++;
           }
           String key = Arrays.toString(charset);
           map.putIfAbsent(key,new ArrayList<>());
           map.get(key).add(s);

       }
       return new ArrayList<>(map.values());
    }
}
