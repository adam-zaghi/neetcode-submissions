class Solution {
    public int maxArea(int[] heights) {
        
        int ans=0;
        int left=0;
        int right=heights.length -1;
        while (left<right){
            int res=(right-left)*(Math.min(heights[left], heights[right]));
            ans = Math.max(ans,res);
            //pour maximiser Math.min(heights[left], heights[right]) on doit absolument boger le petit 
            //height on fesant ca on va sois avoir la meme valeur avoir un nv maximum ou diminuer
            //alors que si on baisse le plus gran don va sois diminuer sois stagner

            if(heights[left]>heights[right]){
                right-=1;
            }else if(heights[left]<heights[right]){
                left++;
            }else{
                if(heights[left+1]<heights[right-1]){
                    left++;
                }else{
                    right-=1;
                }
            }
        }
        return ans;
    }
}
