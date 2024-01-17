import java.util.*;
public class reversearray {
    public static void reverse(int arr[],int n){
        int s=0;
        int e=n-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);

        int arr[]=new int [50];

        System.out.println("enter the size of the array ");
        int n=sc.nextInt();

        System.out.println("enter the array ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
