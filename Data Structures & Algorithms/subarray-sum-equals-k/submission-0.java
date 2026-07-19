class Solution {
    public int subarraySum(int[] nums, int k) {
        //presum+occurence
        Map<Integer,Integer>occurence=new HashMap<>();
        //intialise the first element bu a sum of 0 
        occurence.put(0,1);
        //current sum
        int s=0;
        int res=0;

        for(int e: nums){
            //increment sum
            s+=e;
            int neededsumToRemove=s-k;
            //do we have a sum that start from begining to remove and get k ? 
            if(occurence.containsKey(neededsumToRemove)){
                res+=occurence.get(neededsumToRemove);
            }
            //update the map increment if existe or initialise by 1
            occurence.put(s,occurence.getOrDefault(s,0)+1);


        }
        return res;

    }
}