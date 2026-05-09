class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        Set <Integer> num =new HashSet<>();
        for (int n:nums){
            if (num.contains(n)){
                continue;
            }
            num.add(n);
        }


        for (int e: num){
            if(num.contains(e-1)){
                continue;
            }
           
            int length=1;
            while(num.contains(e+length)){
                length++;

            }

            if(ans<length){
                ans=length;
            }

        }
        return ans;
    }
}
