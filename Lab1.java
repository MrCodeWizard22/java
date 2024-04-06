import java.util.*;
public class Lab1 {
    public static int findgreatest(int a , int b , int c ){
        if (a > b){
            if(a > c){
                return a ;
            }
            else {
                return c;
            }

        }
        else{
            if (b > c){
                return b;
            }
            else {
                return c;
            }
        }
    }
    public static int oddSum(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum ;
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the greatest value among the three is "+ findgreatest(a, b, c));
    }
}
