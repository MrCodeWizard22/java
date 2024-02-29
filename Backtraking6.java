// Sodoku:-
    // in Sodoku here we fill the elements from 1 to 9 in such a way that there are no same two elements in :-
    //     row or column or same 3*3 grid
    // we've to fill the sodoku in such a way that all digits from 1 to 9 be in the each row , cokumn and 3*3 grid 
// in this program we'll find whether there is a way or not 

public class Backtraking6{

    public static boolean isSafe(int sodoku[][] , int row , int col , int digit){

        for(int i = 0 ;i<=8; i++){
            if(sodoku[i][col] == digit){
                return false;
            } 

        }
        for (int j = 0;j<=8;j++){
            if (sodoku[row][j] == digit ){
                return false;
            }
        }

        int sr = (row / 3)* 3;
        int sc = (col / 3) * 3;

        for(int i = sr; i < sr+3; i++){
            for (int j = sc; j < sc + 3; j++){
                if (sodoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solve(int sodoku[][] , int row ,int col){
        if (row == 9) {
            return true; 
        }
        else if (col == 9) { 
            return solve(sodoku, row + 1, 0);
        }

        int row1 = row ;
        int col1 = col +1;
        if (col + 1 == 9){
            row1 = row +1;
            col1 = 0;
        }

        if (sodoku[row][col]!=0){
            return solve(sodoku, row1, col1);
        }

        for (int i = 1; i <= 9; i++){
            if (isSafe (sodoku , row , col , i)){
                sodoku[row][col] = i;
                if (solve(sodoku, row1, col1)){
                    return true;
                }
                sodoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSodoku(int sodoku[][]){
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(sodoku[i][j] + " ");
            }
            System.out.println();
        }
            
            
        
    }

    public static void main(String []args){
        int sodoku[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
            

        };
        int row = 0;
        int col = 0;
        if(solve(sodoku , row , col)){
            printSodoku(sodoku);
        }
        else {
            System.out.println("no solution found ");
        }
    }


}