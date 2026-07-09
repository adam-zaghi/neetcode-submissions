class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right = nums.length-1;
        int k=0;

        while (left<=right){
            if(nums[left]==val){
                while(nums[right]==val ){
                    
                   if (left==right){
                    return k;
                   }
                   right-=1;
                }
                nums[left]=nums[right];
                right-=1;
            }
            left++;
            k++;

        }
        return k;
        


    }
}