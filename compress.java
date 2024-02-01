import java.util.*;
public class compress {
    public static StringBuilder compressor(String str){
        StringBuilder ans = new StringBuilder("");
        int i=0;
        int j=0;
        while(i<str.length() && j<str.length()){
            if(str.charAt(i) == str.charAt(j)){
                j++;
            }
            else{
                ans=ans.append(str.charAt(i));
                int count=j-i;
                char ct = Character.forDigit(count, 10);
                ans=ans.append(ct);
                i=j;
            }
        }
        ans=ans.append(str.charAt(i));
        ans=ans.append(Character.forDigit(j-i, 10));
        return ans;
    }
    public static void main(String []args){

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();
        System.out.println("the compressed string is "+compressor(str));
        
    }
}
