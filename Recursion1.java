// printing the numbers from n to 1 and 1 to nusing recursion 
import java.util.*;
public class Recursion1 {
    public static void printNum(int n){
        if (n == 0){
            return ;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void printn(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        printn(n-1);
        System.out.println(n);

    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("in dec order ");
        printNum(n);
        System.out.println("in inc order");
        printn(n);
    }
}
