// Grid Ways:-
    // here we'll find the number of grid ways to reach from source to destination in 
    // a 2d matrix basically from (0,0) to (n-1,m-1)
public class Backtracking5 {

    public static int findWays( int i , int j , int n , int m ){
        if (i == n-1 && j == m-1){
            return 1;
        }

        else if (i==n || j==m){
            return 0;
        }
        
        int one = findWays(i+1, j, n, m);
        int two = findWays(i, j+1, n, m);

        return one + two ;

    }

    public static void main(String []args){
        
        int n = 3 , m = 3;
        
        int ans = findWays(0 , 0 , n , m );
        System.out.println("total ways: "+ ans);
    }
    
}
