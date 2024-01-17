import java.util.*;
public class subarrays {
    public static void printsubarray(int arr[],int n){

        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                System.out.print("[");
                for(int k=i;k<j;k++){

                    // if(k<j){
                    //     System.out.print(",");
                    // }
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.print("]");
                

            }
            System.out.println();

        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int arr[]=new int [50];
        int n;

        System.out.println("enter the size of the array ");
        n=sc.nextInt();

        System.out.println("now enter the array ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printsubarray(arr,n);

    }
}
