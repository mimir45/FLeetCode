package leetcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public static void main(String[] args) {
       List<String> str = new ArrayList<>();
       str.add("test");
       str.add("yarra");
       String test = encode(str);
       List<String> testres = decode(test);
       System.out.println(test);
       System.out.println();
       for(String s:testres){
           System.out.println(s);
       }
    }
    
    public static String encode(List<String> str) {
         if(str.isEmpty()){
              return "";
          }
         StringBuilder sb = new StringBuilder();
         // Add length of each string followed by a delimiter
         for(String s : str){
             sb.append(s.length()).append('c');
         }
         sb.append('#');
         // Add actual string content
         for (String s : str) {
             sb.append(s);  // Append the string value, not the list
         }
         return sb.toString();
    }
    
    public static List<String> decode(String str){
        if(str.isEmpty()){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        int index = 0;
        
        // Parse the lengths
        StringBuilder curr = new StringBuilder();
        while(str.charAt(index) != '#'){
            if(str.charAt(index) == 'c'){
                // When we hit 'c', parse the number before it
                size.add(Integer.parseInt(curr.toString()));
                curr = new StringBuilder();
            } else {
                // Build the number string
                curr.append(str.charAt(index));
            }
            index++;
        }
        
        // Move past the '#' delimiter
        index++;
        
        // Extract each substring based on the sizes
        for(int length : size){
            result.add(str.substring(index, index + length));
            index += length;
        }
        
        return result;
    }
}