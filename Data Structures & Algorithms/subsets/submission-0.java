class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>sub=new ArrayList<>();

        dfs(nums,0,sub,res);
        return res;
    }
    private void dfs(int[] inputArray,int indexOfTheNodeOfArray,List<Integer> subArray,List<List<Integer>> results){
            //verify base case if index >= 3(outofbound of nums) we add subarray to res and we return 
            //to close the function and continue the recursions calls
            if(indexOfTheNodeOfArray >= inputArray.length ){
                //base case
                results.add(new ArrayList<>(subArray));
                return;//to exit
            }
            //now we gonna and and then substract and dfs on them 
            subArray.add(inputArray[indexOfTheNodeOfArray]);
            dfs(inputArray,indexOfTheNodeOfArray+1,subArray,results);

            //remove last element it will always be the element added with the
            //fuction above see the graphe for more clarity

            subArray.remove(subArray.size()-1);
            dfs(inputArray,indexOfTheNodeOfArray+1,subArray,results);
        }
}
