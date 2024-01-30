import java.util.*;
public class twoD_arrays {
    public static boolean linearSearch(int arr[][],int key){
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==key)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static int smallest(int [][]arr,int m,int n){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<ans){
                    ans=arr[i][j];
                }
            }
        }
        return ans;
    }
    public static int largest(int [][]arr,int m,int n){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>ans){
                    ans=arr[i][j];
                }
            }
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int arr[][]=new int [10][10];
        System.out.println("enter the rows");
        int n=sc.nextInt();
        System.out.println("enter the columns");
        int m=sc.nextInt();

        System.out.println("enter the elements");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("entered elements are");


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println("enter the key");
        // int key=sc.nextInt();

        // System.out.println(linearSearch(arr, key));

        System.out.println("the smallest element in the matrix is "+smallest(arr,n,m));
        System.out.println("the largest element in the matrix is "+largest(arr,n,m));
    }
    
}
