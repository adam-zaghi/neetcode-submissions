class Solution {
    public int mySqrt(int x) {
        if (x==0) return 0;
        int left =0;
        int right=x;
        while (left<=right){
            int m=left+(right-left)/2;
            
            if((long)m*m>x){
                right=m-1;
            }else if((long)m*m<x){
                left=m+1;
            }else{
                return m;
            }
        }
        return right;
    }
}