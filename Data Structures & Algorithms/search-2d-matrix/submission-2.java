class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //row length
        int rowL = matrix[0].length-1;
        //int division always round down 0123 = 3/2=1 we check 1+1 2
        int left=0;
        int right=matrix.length-1;
        int m=(right+left)/2 ;
        while(left<=right){
           if(matrix[m][0]>target){
                right=m-1;
           }else if(matrix[m][rowL]<target){
                left=m+1;
           }else{
                for (int e:matrix[m]){
                    if(e==target){
                        return true;
                    }
                }
                return false;
           }
           m=(right+left)/2;



        }
        
        return false;
    }
}
