import java.util.*;
public class linearsearch {
    public static int search (int arr[], int key,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [50];
        System.out.println("enter the size of the array ");
        int n=sc.nextInt();
        System.out.println("now enter the array ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key");
        int key=sc.nextInt();

        if(search(arr, key,n)==-1){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index: "+search(arr, key,n));
        }
    }
}
