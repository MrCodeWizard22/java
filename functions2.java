import java .util.*;
// creating a function to find the factorial of a given number using which we're calculating the nCr or binomial coefficient
public class functions2 {
    public static int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        // int num=sc.nextInt();
        // if(num<0){
        //     System.out.println("no factorial is defined for negative numbers ");
        // }
        // else{
        //     System.out.println(factorial(num));
        // }
        

        int n=sc.nextInt();
        int r=sc.nextInt();

        int result=(factorial(n))/((factorial(r))*factorial(n-r));
        System.out.println(result);
    }
}
