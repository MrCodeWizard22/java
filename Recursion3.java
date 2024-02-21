import java.util.*;
// checking whether the given array is sorted or not 
public class Recursion3 {

    public static boolean check(int arr[], int n) {
        if (n <= 1) {
            return true;
        }
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }
        return check(arr, n - 1);
    }
    
    
    
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [50];
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();

        for(int i=0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean ans = check(arr,n);
        if(ans==true){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }
    }
}
