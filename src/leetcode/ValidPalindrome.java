package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String  test = ".,";
        boolean res = isPalindrome(test);
        System.out.println(res );
    }

    public static  boolean isPalindrome(String s){

        int indexL=0;
        int indexR= s.length()-1;
        while (indexR>indexL){
            while (!alphaNum(s.charAt(indexR))&& indexR>indexL){
                indexR--;
            }
            while (!alphaNum(s.charAt(indexL))&&indexL<indexR){
                indexL++;
            }
            if(s.toLowerCase().charAt(indexR) != s.toLowerCase().charAt(indexL)){
               return false;

            }
                indexR--;
                indexL++;

        }
        return  true;

    }
    public static boolean alphaNum(char c ){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

}
