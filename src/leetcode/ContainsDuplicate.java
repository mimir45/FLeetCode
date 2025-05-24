package leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        HashMap hs = new HashMap();
        for(int i:nums){
            if(hs.containsKey(i)){
                return true;
            }
            hs.put(i,1);
        }
        return false;

    }
}
