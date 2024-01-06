import java.util.*;
public class conditionals {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // if(a==b){
        //     System.out.println("both are equal ");
        // }
        // else if(a>b){
        //     System.out.println(a+" a is greater ");
        // }
        // else {
        //     System.out.println(b+" b is greater ");
        // }

        // finding whether a number is even or odd

        // int n=sc.nextInt();
        // if(n%2==0){
        //     System.out.println("even");
        // }
        // else {
        //     System.out.println("odd ");
        // }


        // income tax

        // int income =sc.nextInt();
        // float tax=0;
        // if(income <=500000){
        //     tax=0;

        // }
        // else if(income >500000 && income <=1000000){
        //     tax=0.2f*income;
        // }
        // else {
        //     tax=0.3f*income ;
        // }
        // System.out .println("tax is "+ tax);


        // print the largest of three numbers 

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is largest ");
            }
            else{
                System.out.println(c+" is largest ");
            }

        }
        else {
            if(b>c){
                System.out.println(b+" is largest ");
            }
            else {
                System.out.println(c+" is largest");
            }
        }
    }
}
