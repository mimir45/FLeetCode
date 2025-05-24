package leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        MergeStringsAlternately ms = new MergeStringsAlternately();
        String result = ms.mergeAlternately(word1, word2);
        System.out.println(result);


    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        while(word1.length()>0 || word2.length()>0){
            if(word1.length()>0){
                sb.append(word1.charAt(0));
                word1 = word1.substring(1);
            }
            if(word2.length()>0){
                sb.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
        }
        return sb.toString();


    }
}
