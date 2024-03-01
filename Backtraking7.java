// Rat in a Maze problem 

public class Backtraking7 {

    public static boolean isSafe(int maze[][], int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1);
    }

    public static void findpath(int maze[][] , int row , int col , StringBuilder ans){

        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(ans.toString());
            return;
        }
        else if(row >= maze.length || col >= maze[0].length){
            return;
        }
    
        if (isSafe(maze , row+1 , col)){
            ans.append('D');
            findpath(maze, row+1, col, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
        if (isSafe( maze , row , col+1)){
            ans.append('R');
            findpath(maze, row, col+1, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
    }

    public static void main(String []args){
        int maze[][] = { 
                        { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };
        StringBuilder ans =new StringBuilder();
        findpath(maze , 0 , 0 , ans );
    }
    
}
