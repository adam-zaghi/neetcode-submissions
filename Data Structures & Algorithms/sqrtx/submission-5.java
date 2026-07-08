class Solution {
    public int mySqrt(int x) {
        if (x==0) return 0;
        if (x==1) return 1;
        int left =0;
        int right=x;
        while (left<=right){
            int m=left+(right-left)/2;
            
            if(m>x/m){
                right=m-1;
            }else if(m<x/m){
                left=m+1;
            }else{
                return m;
            }
        }
        return right;
    }
}