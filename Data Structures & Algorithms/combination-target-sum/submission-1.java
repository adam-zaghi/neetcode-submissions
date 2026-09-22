class Solution {

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> subset=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        dfs(nums,0,0,target);
        return res;
    }
    public void dfs(int[] nums, int index,int sum , int t) {
        if(index>=nums.length || sum>t ){
            return;
        }
        if(sum==t){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        sum+=nums[index];
        dfs(nums,index,sum,t);
        
        if(sum>=t){
            subset.remove(subset.size()-1);
        sum-=nums[index];
        return ;
        }
        subset.remove(subset.size()-1);
        sum-=nums[index];
        

        dfs(nums,++index,sum,t);
    }
}
