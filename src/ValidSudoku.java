public class ValidSudoku {

    public static void main (String[] args){

        char[][] board = {
                {'9', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '5', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValid(board));
    }

    static boolean isValid(char[][] board){
        for(int i = 0; i < 9;i++){
            if (!validRow(board, i))
                return false;
        }
        for(int i = 0; i < 9;i++){
            if (!validCol(board, i))
                return false;
        }
        for(int i = 0; i < 9;i+=3){
            for(int j = 0; j < 9;j+=3){
                if (!validGrid(board, i, j))
                    return false;
            }
        }
        return true;
    }

    static boolean validRow(char[][] board, int row){
        int [] vis = new int[10];
        for(int i = 0; i < 9; i++){
            char ch = board[row][i];
            if(ch != '.'){
                int val = ch - '0';
                if(vis[val] != 0){
                    return false;
                }
                vis[val]++;
            }
        }
        return true;
    }

    static boolean validCol(char[][] board, int col){
        int [] vis = new int[10];
        for(int i = 0; i < 9; i++){
            char ch = board[i][col];
            if(ch != '.'){
                int val = ch - '0';
                if(vis[val] != 0){
                    return false;
                }
                vis[val]++;
            }
        }
        return true;
    }

    static boolean validGrid(char[][] board, int startRow, int startCol){
        int [] vis = new int[10];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                char ch = board[i + startRow][j + startCol];
                if(ch != '.'){
                    int val = ch - '0';
                    if(vis[val] != 0){
                        return false;
                    }
                    vis[val]++;
                }
            }
        }
        return true;
    }
}
