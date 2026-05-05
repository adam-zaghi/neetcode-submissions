class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix et postfix (depuis la garche / depuis la droite)
        int[] pre=new int[nums.length];
        int[] post=new  int[nums.length];
        int temp=1;
        int temp2=1;


        for (int i=0;i<nums.length;i++){
            temp=temp*nums[i];
            pre[i]=temp;
            
            temp2=temp2*nums[nums.length-1-i];
            post[nums.length-i-1]=temp2;

        }
        int[] ans=new int [nums.length];
        for (int i=0;i<nums.length;i++){
            
            if(i<1){
                ans[i]=post[i+1];
            }
            else if (i==nums.length-1){
                    ans[i]=pre[i-1];
                
            }
            else{
                ans[i]=pre[i-1]*post[i+1];
            }
        }
        return ans;
    }
}  
