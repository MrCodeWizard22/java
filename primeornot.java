import java.util.*;
public class primeornot {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        boolean flag=false;
        if(n==2){
            System.out.println("number is prime ");
            
        }
        else if(n==1){
            System.out.println("number is neither composite nor prime ");
        }
        else {
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println("it is prime ");
            }
            else {
                System.out.println("it is not prime ");
            }
        }
        
    }
}
