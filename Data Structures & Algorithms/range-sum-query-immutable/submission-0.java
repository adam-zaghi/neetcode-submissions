class NumArray {

    private int[] nums;

    private int[] prefix;

    public NumArray(int[] nums) {
        this.nums=nums;
        this.prefix=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=this.nums[i];
            this.prefix[i]=total;
        }

    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefix[right];
        }
        return prefix[right]-prefix[left-1];
        //this.prefix[right]-this.prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */