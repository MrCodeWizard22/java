// n queen problem:-
    // firstly we have a n * n board and n queens and we need to place n queens in n rows "first forget about the attacking of the queens "
    // now we find the place is safe or not then place the queen 

public class Backtracking4 {

    public static void nQueens (char board[][] , int row){
        if (row == board.length){
            System.out.println();
            printBoards(board);
            return ;
        }

        for (int j = 0; j < board.length; j++){
            if (isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens (board , row +1);
                board [row][j] = '.';
            }
        }
    }

    public static boolean isSafe(char board[][] , int row , int col){
        // in this function we'll check three conditions vertically up, up left diagonal and up right diagonal ...
        //  i.e. (all three moves of queen)

        // vertical up 

        for (int i = row - 1; i >= 0; i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonal left up 
        for (int i = row - 1 ,j = col - 1; i >= 0 && j>=0 ; i--, j-- ){
            if (board [i][j]=='Q'){
                return false;
            }
        }

        // diagonal right up 

        for (int i = row - 1 , j = col + 1; i >= 0 && j < board.length; i--, j++){
            if (board [i][j] == 'Q'){
                return false ;
            }
        }
        return true;
    }

    public static void printBoards(char board[][]){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                System.out.print(" "+ board[i][j]+ " " );
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        nQueens(board , 0);
    }
    
}
