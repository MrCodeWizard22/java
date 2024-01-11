import java.util .*;
// questions in assignment based on functions 
public class assignment3 {
    public static int sumDigits(int n){
        int ans=0;
        while(n>0){
            int rem=n % 10;
            ans+=rem;
            n=n/10;
        }
        return ans;
    }
    public static boolean isPallindrome(int n){
        int temp=n;
        int ans=0;
        while(temp>0){
            int rem= temp % 10;
            ans=ans*10+rem;
            temp/=10;
        }
        
        return n==ans;
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        // System.out.println("digits sum of n is "+sumDigits(n));
        // System.out.println(isPallindrome(n));
        System.out.println(isEven(n));
    }
    
}
