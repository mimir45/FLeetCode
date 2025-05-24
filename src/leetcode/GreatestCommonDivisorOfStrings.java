package leetcode;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        GreatestCommonDivisorOfStrings gcd = new GreatestCommonDivisorOfStrings();
        String result = gcd.gcdOfStrings(str1, str2);
        System.out.println(result);

    }
    public String gcdOfStrings(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty()){
            return "";
        }
        if(str1.equals(str2)){
            return str1;
        }
        return (str1+str2 == str2+str1 )? str1.substring(0,gcd(str1.length() ,str2.length())) :"" ;


    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
