class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRow(board) && checkCol(board) && isValidBox(board);
    }
    public boolean checkRow(char[][] board){
        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    public boolean checkCol(char[][] board){
        for(int j=0; j<9; j++){ 
            Set<Character> set = new HashSet<>();
            for(int i=0; i<9; i++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    public boolean isValidBox(char[][] board){
        for(int block=0; block<9; block++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    int row = 3 * (block / 3) + i;
                    int col = 3 * (block % 3) + j;
                    if(board[row][col] != '.'){
                        if(set.contains(board[row][col])){
                            return false;
                        }
                        set.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
}