class Solution {
    List<List<Integer>> res= new ArrayList<>();
    List<Integer> sub = new ArrayList<>();
    List<Boolean> bold;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        bold=new ArrayList<>();
        for(int n:nums){
            bold.add(false);
        }
        
        dfs(nums);
        return res;
    }
    public void dfs(int[] nums){
        if(nums.length==sub.size()){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //element est false donc pas dans sub
            if(!bold.get(i)){
                bold.set(i,true);
                sub.add(nums[i]);
                dfs(nums);  
                //backtracking
                bold.set(i,false);
                sub.remove(sub.size()-1);

                while(i<nums.length-1 && nums[i]==nums[i+1]){
                    i++;
                }

            }



        }


    }

}