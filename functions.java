import java.util .*;
// functions basic creating a function which will return the product of two numbers
public class functions {
    public static int result(int a, int b){
        return a*b;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(result(num1, num2));
    }
    
}
