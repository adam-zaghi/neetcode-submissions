class Solution {
    
    
    Set<Pair<Integer,Integer>> set=new HashSet<>();
    public boolean exist(char[][] board, String word) {
       
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    if (dfs(board,i,j,word,0)){
                        return true;
                    }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int i, int j,String word, int index){
        if(index>=word.length()){
            return true;
        }
         if(i<0 || i >=board.length || j<0 || j>=board[0].length){
            return false;
        }
        if(word.charAt(index)!=board[i][j]){
            return false;
        }
       
        if(set.contains(new Pair<>(i,j))){
            return false;
        }
       
        set.add(new Pair<>(i,j));
        boolean bol=
            //up
            dfs(board,i+1,j,word,index+1)||
            //right
            dfs(board,i,j+1,word,index+1)||
            //left
            dfs(board,i,j-1,word,index+1)||
            //down
            dfs(board,i-1,j,word,index+1)
            ;

        set.remove(new Pair<>(i,j));
        return bol;

    }
}
