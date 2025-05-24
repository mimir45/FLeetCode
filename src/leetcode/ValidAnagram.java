package leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {


    boolean result= isAnagram("anagram", "nagaram");
    System.out.println(result);

    }
    public static boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> map = new HashMap<>();
       if(s.length()!=t.length()){
           return false;
       }
       for(char c:s.toCharArray()){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else{
               map.put(c,1);
           }
       }
       for(char c:t.toCharArray()){
           if(map.containsKey(c)){
               if(map.get(c)>0){
                   map.put(c,map.get(c)-1);
               } else{
                   return false;
               }
           }else{
               return false;
           }
       }
       return true;
    }
}
