class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res=0;
        for(int i=cardPoints.length-k;i<cardPoints.length;i++){
            res+=cardPoints[i];
        }
        int current=res;
        int left=0;
        int right=cardPoints.length-k-1;
        for(int i=0;i<k;i++){ // 0
            right++;
            current-=cardPoints[right];
            current+=cardPoints[left];
            left++;
            if(current>res){
                res=current;
            }

        }
        return res;
    }
}