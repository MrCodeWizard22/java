import java.util.*;
public class factorial {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the value to get the factorial");

        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.println("the factorial of the number is "+ ans);
    }
}
