// implementing quicksort:-
//    it's a recursive approach to sort an array using pivot and partition technique

import java.util.*;

public class Quicksort {

    public static int partition(int arr[], int s, int e, int piv) {

        int i = s - 1;
    
        for (int j = s; j < e; j++) {
            if (arr[j] < piv) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        int temp = arr[i + 1];
        arr[i + 1] = arr[e];
        arr[e] = temp;
    
        return i + 1;
    }

    public static void quick_sort(int arr[] , int s , int e){

        if(s>=e){
            return ;
        }
        int piv = arr[e];
        int loc = partition(arr , s, e , piv);

        quick_sort(arr, s, loc-1);
        quick_sort(arr, loc+1, e);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int arr[] = new int [50];
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("Now enter the array ");

        for(int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = n-1;
        quick_sort(arr,s,e);
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }    
}
