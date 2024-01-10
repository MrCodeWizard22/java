import java.util.*;
// binary to decimal conversion using function 
public class functions5 {
    public static int power(int b,int r){
        int result=1;
        for(int i=1;i<=r;i++){
            result*=b;
        }
        return result;
    }
    public static int convert(int n){
        int i=0;
        int b=2;
        int  p=power(b,i);
        int result=0;

        while(n>0){
            int rem=n%10;
            result+=(rem*p);
            i++;
            n=n/10;
            p=power(b, i);

        }
        return result;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(convert(n));
    }
    
}
