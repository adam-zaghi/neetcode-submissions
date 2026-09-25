class Solution {
    public List<List<Integer>>res=new ArrayList<>();
    public List<Integer> sub = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        dfs(0,nums);
        return res;

    }
    public void dfs(int index, int[] nums){
        if(index==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        dfs(index+1,nums);

        sub.remove(sub.size()-1);

        int e=nums[index];
        while(index<nums.length && nums[index]==e  ){
            index++;
        }
        dfs(index,nums);
       // dfs(index+1,nums);


    }
}
