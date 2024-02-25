// applying merge sort 
// recursive algorithm to sort an array 

import java.util.*;
public class Mergesort {

    public static void merge(int arr[], int s, int mid , int e){
        int temp [] = new int [e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= e){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= e){
            temp[k++] = arr[j++];
        }

        for(int l = 0 , x = s; l < temp.length; l++, x++){
            arr[x] = temp[l];
        }

    }

    public static void merge_sort(int arr[] , int s, int e){
        if(s>=e){
            return ;
        }

        int mid = s + (e - s)/2;
        merge_sort(arr, s, mid);
        merge_sort(arr, mid+1, e);

        merge(arr,s,mid,e);

    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int arr[] = new int [50];

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        System.out.println("now enter the array ");
        for(int i=0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = n - 1;
        merge_sort(arr, s, e);


        for(int i=0 ; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
