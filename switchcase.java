// calculator using switch case 
import java.util.*;
public class switchcase {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result =0;
        char ch=sc.next().charAt(0);

        switch (ch) {
                case '+': result=a+b;
                        System.out.println("the result is  :"+result);
                        break;
                case '-': result=a-b;
                        System.out.println("the result is  :"+result);
                        break;
                case '*': result=a*b;
                        System.out.println("the result is  :"+result);
                        break;
                case '/': result=a/b;
                        System.out.println("the result is  :"+result);
                        break;
                case '%': result=a%b;
                        System.out.println("the result is  :"+result);
                        break;
                default:System.out.println("invalid choice ");
        }
        
    }
    
}
