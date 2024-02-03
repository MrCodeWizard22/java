import java.util.*;
//check whether the number is even or odd 
public class bitManipulation{
    public static int check(int n){
        return (n & 1);
    }
    public static void main(String []args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        int ans = check(n);

        if(ans == 0){

            System.out.println(n + " : is even");
        }
        else {
            System.out.println(n+ " :  is odd");
        }

    }
}