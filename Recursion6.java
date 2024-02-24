// tilling problem 

// we have a floor size 2*n and a tile of size 2*1 we have to find the number of ways to put the tiles on the floor 
// there could be no. of ways first we can put tile in horizontal way or vertical wayand in similiar fashion we have to find all ways 

import java.util.*;
public class Recursion6 {

    public static int calcWays(int n){
        if(n==1 || n==0){
            return 1;
        }

        int ver = calcWays(n-1);

        int hor = calcWays(n-2);

        return ver + hor;
    }
    public static void main(String []args){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the size of tile ie for 2*n you have to enter n only");
        int n = sc.nextInt();

        int ans = calcWays(n);
        System.out.println("no. of ways to do the smae thing are "+ ans);
    }
    
}

