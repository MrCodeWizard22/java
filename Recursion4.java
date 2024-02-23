// finding the first and last occurance of the number in array
import java.util.*;
public class Recursion4 {
    public static int lastOccurance(int arr[], int n, int key){
        if(n==1 && arr[n-1]!=key){
            return -1;
        }
        if(arr[n-1]==key){
            return n-1; 
        }
            

        return lastOccurance(arr, n-1, key);
    }

    public static int firstOccurance (int arr[], int n, int key ,int i){
        if(i==n-1 && arr[i]!=key){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, n, key, i+1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [50];
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();

        System.out.println("now enter the array");
        for(int i=0; i < n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("now enter the key");
        int key = sc.nextInt();
        System.out.println("the first occurance of the number is "+ firstOccurance(arr, n, key, 0));
        System.out.println("the last occurance of the number is "+lastOccurance(arr,n,key));
    }
}
