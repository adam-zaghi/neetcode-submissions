class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        
        int r=Arrays.stream(piles).max().getAsInt();
          while(l<r){
            int m=l+(r-l)/2;
          
            if (isKvalid(piles,h,m)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return r;
      

    }

    public boolean isKvalid(int[] piles, int h,int k){
        long totaleTime=0;
        for(int e:piles){
            totaleTime+=(e+k-1)/k;
        }
        if(totaleTime>h){
            return false;
        }
        return true;
    }
}
