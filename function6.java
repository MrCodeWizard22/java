import java .util.*;
// convert decimal to binary using function 
public class function6 {
    public static String convert (int n){
        String ans="";
        while(n>0){
            int rem=n % 2;
            char ch=(char)('0'+rem);
            ans=ch+ans;
            n=n/2;
        }
        
        return ans;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(convert(n));
    }
    
}
