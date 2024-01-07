import java.util.*;
public class even_oddsum {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int ch;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("enter the value");
            int n=sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }
            else {
                oddSum+=n;
            }
            System.out.println("want to enter more numbers 1 or 0 ");
            ch=sc.nextInt();
        }while(ch==1);

        System.out.println("the even sum is "+evenSum);
        System.out.println("the odd sum is "+oddSum);
        
    }
}
