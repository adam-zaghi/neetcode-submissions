class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,HashSet<Character>> row = new HashMap<>();
        Map<Integer,HashSet<Character>> column = new HashMap<>();
        Map<String,HashSet<Character>>square = new HashMap<>();


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }

                String keysquare=(i/3)+","+(j/3);

                row.computeIfAbsent(
                    i,k->new HashSet<Character>()
                );
                column.computeIfAbsent(
                    j,k->new HashSet<Character>()
                );
                square.computeIfAbsent(
                    keysquare,k->new HashSet<Character>()
                );

                if(
                    column.get(j).contains(board[i][j])||
                    row.get(i).contains(board[i][j])||
                    square.get(keysquare).contains(board[i][j])
                
                ){
                    return false;
                }
                row.get(i).add(board[i][j]);
                column.get(j).add(board[i][j]);
                square.get(keysquare).add(board[i][j]);

            }

        }
        return true ;


    }
}
