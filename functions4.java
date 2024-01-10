import java.util.*;
// function to find the prime numbers in a given range 
public class functions4 {
    public static boolean prime (int n){
        if(n==1){
            return false;
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
        int lb=sc.nextInt();
        int ub=sc.nextInt();

        for(int i=lb;i<=ub;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}
