class Solution {

    List<List<Integer>> res=new ArrayList<>();
    List<Integer> subset=new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        dfs(candidates , 0, target,0);
        return res;
    }
    public void dfs(int[] candidates, int index,int target,long sum){
        if(sum==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(index>=candidates.length || sum>target){
            return;
        }
        
        
        subset.add(candidates[index]);
        sum+=candidates[index];
        dfs(candidates , index+1, target,sum);

        if(sum>=target){
            
            subset.remove(subset.size()-1);
            return;
        }
        
        sum-=candidates[index];
        subset.remove(subset.size()-1);
        if(index==candidates.length-1)return;
        int intToChange=candidates[index];
        while(index <candidates.length && intToChange==candidates[index] ){
            index++;
        }
        dfs(candidates , index, target,sum);


    }
}
