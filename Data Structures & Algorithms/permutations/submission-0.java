class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<Integer> sub = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums);
        return res;
    }
    public void dfs( int nums[] ){
        if(sub.size()==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int e:nums){
            if(sub.contains(e))continue;
            sub.add(e);
            dfs( nums);
            sub.remove(sub.size()-1);
         
        }



    }
}
