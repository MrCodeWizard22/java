import java.util.*;
public class assignment2 {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();

        // finding whether the number is positive or negative

        // if(n==0){
        //     System.out.println("it is 0");
        // }
        // else if(n<0){
        //     System.out.println("it is negative");
        // }
        // else {
        //     System.out.println("it is positive");
        // }

        // week days name using the day number 

        // switch (n){
        //     case 1: System.out.println("Monday");
        //             break;
        //     case 2: System.out.println("tuesday");
        //             break;
        //     case 3: System.out.println("Wednesday");
        //             break;
        //     case 4: System.out.println("Thursday");
        //             break;
        //     case 5: System.out.println("Friday");
        //             break;
        //     case 6: System.out.println("Satday");
        //             break;
        //     case 7: System.out.println("Sunday");
        //             break;
        //     default:System.out .println("invalid choice ");
        // }

        // finding the entered year is leap year or not 

        int yr=sc.nextInt();
        if(yr%400==0){
            System.out.println("year is leap year");
        }
        else if(yr%100==0){
            System.out.println("year is not leap year");
        }
        else if(yr%4==0){
            System.out.println("year is leap year ");

        }
        else {
            System.out.println("year is not a leap year");
        }

    }
}
