// given a sentence, we need to uppercase the first letter of each word in it 
import java.util.*;
public class uppercae {
    public static StringBuilder solve(String str){
        StringBuilder ans=new StringBuilder("");
        char temp=Character.toUpperCase(str.charAt(0));
        ans=ans.append(temp);
        for(int i=1;i<str.length();i++){
            char ch2=str.charAt(i-1);
             temp=str.charAt(i);
            if(ch2 == ' '){
                temp=Character.toUpperCase(temp);
                ans=ans.append(temp);
            }
            else{
                ans=ans.append(temp);
            }
        }
        return ans;
    }
    
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();

        System.out.println("the answer is "+ solve(str));

    }
}
