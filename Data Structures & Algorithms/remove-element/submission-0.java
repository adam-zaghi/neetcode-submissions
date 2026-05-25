class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=val ){
                k++;
                continue;
            }
            
            if(i==nums.length-1 && nums[i]==val ){return k;}
            
            for(int j=i ;j<nums.length;j++){
                if (nums[j]==val){
                    continue;
                }
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                k++;
                
                break;
            }
        }
        return k;


    }
}