class Solution {
    public int pivotIndex(int[] nums) {
        int totale=0;
        for(int e:nums){
            totale+=e;
        }
        int leftsum=0;
        int rightsum=totale;

        for (int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];

        }
        return -1;
    }
}