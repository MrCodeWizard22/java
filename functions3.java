import java.util.*;
// function to check whether a number is prime or not 
public class functions3 {
    public static boolean check(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        System.out.println(check(n));
    }
}
