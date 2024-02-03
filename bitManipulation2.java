import java.util.*;
// get the ith bit of the number 
public class bitManipulation2 {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in );
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("enter the index of the bit ");
        int i = sc.nextInt();
        int temp = (1<<i);
        
        System.out.println(i + "th" +" bit of " + n + " is "+ (n & temp));
    }
}
