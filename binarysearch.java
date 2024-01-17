import java.util.*;
public class binarysearch {
    public static int search(int arr[],int n,int key){
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            }

            else if(arr[mid]>key){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int arr[]=new int [50];

        System.out.println("enter the size of array ");
        int n=sc.nextInt();

        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("now enter the key");

        int key=sc.nextInt();

        if(search(arr,n,key)!=-1){
            System.out.println("element found at "+search(arr, n, key));
        }

        else{
            System.out.println("element not found ");
        }

    }
}
