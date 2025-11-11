package leetcode;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

//    // cahracter and count for example  anagram a repeted 3 times
//    HashMap<Character, Integer> map = new HashMap<>();
//
//    for (Character c : s.toCharArray()) {
//      if (map.containsKey(c)) {
//        map.put(c, map.get(c) + 1);
//      } else {
//        map.put(c, 1);
//      }
//    }
//    for (Character c : t.toCharArray()) {
//      if (map.containsKey(c)) {
//        if (map.get(c) > 0) {
//          map.put(c, map.get(c) - 1);
//        } else {
//          return false;
//        }
//      } else {
//        return false;
//      }
//    }

    int[] chars1 = new int[26];
    int[] chars2 = new int[26];

    for (int i = 0; i < s.length(); i++) {
      chars1[s.charAt(i) - 'a']++;
      chars2[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (chars1[i] != chars2[i]) {
        return false;
      }
    }
    return true;
  }
}