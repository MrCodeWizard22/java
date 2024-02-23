// finding the power of x using recusion
import java.util.*; 
public class Recursion5 {

    public static int calcPow(int x , int n){

        if(n==0){
            return 1;
        }
        return x* calcPow(x, n-1);
    }

    public static int calc(int x ,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return calc(x, n/2) * calc(x, n/2);
        }
        else {
            return x * calc(x, n/2) * calc(x, n/2);
        }
        
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner (System.in );
        System.out.println("enter the value of x and n for the value x^n");
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("the value of x^n is "+ calcPow(x , n));

        System.out.println("the value of x^n using optimized approach is "+ calc(x, n));
    }
}
