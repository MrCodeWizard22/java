// finding the factorial of a given number using recursion 
// finding the sum of first n natural numbers using recursion 
// finding the nth fibonacci number 
import java.util.*;
public class Recursion2 {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n + sum(n-1);
    }

    public static int fibo(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    
    public static void main(String []args){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        // int ans = fact(n);
        

        // System.out.println("the factorial of the given number is "+ ans);
        // int s = sum(n);

        // System.out.println("the sum of the numbers till the given number is "+s);

        System.out.println("the nth fibonacci term is "+ fibo(n));
    }
}
