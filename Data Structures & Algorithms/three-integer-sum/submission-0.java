class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0 ; i<nums.length;i++){
            Set verifdis=new HashSet<>();//-4 -1 -1 0 1 2
            int left=i+1;
            int right=nums.length-1;
            int target=-nums[i];
            while(left<right){
                if(nums[right]+nums[left]>target  || verifdis.contains(right)){
                    right-=1;
                 
                }
                else if(nums[right]+nums[left]<target || verifdis.contains(left)){
                    left++;
                }
                
                else
                {
                    verifdis.addAll(Arrays.asList(left,right));
                    if(!ans.contains(Arrays.asList(nums[i],nums[left],nums[right]) ) ){
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right])); 
                    }
                    
                    left=i+1;
                    right=nums.length-1;
                }

            }
            if (i==nums.length-2){
                break;
            }

        }
        return ans;
    }
}
