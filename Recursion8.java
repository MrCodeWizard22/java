// recusion assignment questions solution 
import java.util.*;
public class Recursion8 {

    // for question -1

    public static void displayKey(int arr[] , int n , int key){
        if(n==1){
            
            return ;
        }
        if(arr[n-1]==key){
            System.out.println(n-1);
        }

        displayKey(arr, n-1, key);


    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [50];

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        System.out.println("enter the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the key");
        int key = sc.nextInt();

        displayKey(arr,n,key);
    }
}
