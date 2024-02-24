// friends pairing problem 
// for n persons:- for each of the person there are two choices either he can be a pair with another person or be single 
// th condition is any two persons can have only one pair i.e. if there are three persons the combination may be 
//  consider three person a ,b, c :-
            // a,b,c           all singles 
            // a,(b,c)
            // b,(a,c)
            // c,(a,b)

            // all four cases we have to return all the number of ways in above case we've to return 4


import java.util.*;
public class Recursion7 {

    public static int calcPairs(int n){

        if (n == 1 || n==0){
            return 1;
        }

        int s = calcPairs(n-1);

        int p = (n-1)*calcPairs(n-2);

        
        return s+p;
    }

    public static void main(String []args){

        Scanner sc = new Scanner (System.in);

        System.out.println("enter the number of friends");
        int n = sc.nextInt();

        int ans = calcPairs(n);

        System.out.println("the total number of ways are "+ ans);


    }
    
}
