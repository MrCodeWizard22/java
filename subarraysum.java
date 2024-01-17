import java.util.*;
public class subarraysum {
    public static int arraysum(int arr[]){
        int curr_sum;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                curr_sum=0;
                for(int k=i;k<=j;k++){
                    curr_sum+=arr[k];
                }
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String []args){
        int arr[]={-1,2,6,-1,3};

        System.out.println("max subarray sum is "+arraysum(arr));
    }
}
