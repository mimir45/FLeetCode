package leetcode;

public class ProductsofArrayExceptSelf {
    public static void main(String[] args) {
        int []nums = {1,2,4,6};
        ProductsofArrayExceptSelf pae = new ProductsofArrayExceptSelf();
         int res [] = pae.productExceptSelf(nums);
        for (int i : res) {
            System.out.println(i);
        }

    }
    public int []productExceptSelf(int []nums) {
//        int []res = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int temp = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if(i!=j){
//                    temp*=nums[j] ;
//                }
//
//            }
//            res[i]= temp;
//
//        }
//        return res ;
// ______________________________________________________
//        int total = 1;
//        for(int i=0;i<nums.length;i++){
//            total*=nums[i];
//        }
//        int []res = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            res[i]=total/nums[i];
//        }
//        return res;
//    }


        int n  = nums.length;
        int[] res = new int[n];
        res[0] =1;
        for (int i =1 ; i<  n ; i++){
            res[i] =  res[i-1] * nums[i-1];
        }
        int postfix= 1;
        for (int  i = n -1 ; i >= 0; i--){
            res[i] *= postfix;
            postfix *=nums[i];
        }
        return res  ;

    }
}
