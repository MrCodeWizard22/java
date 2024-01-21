// using prefix sum approach to find the maximum sum subarray for optimization 
public class subbarray_sum2 {
    public static int sum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int pre[]=new int [arr.length];
        pre[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }

        for(int i=0;i<pre.length;i++){
            currSum=0;
            int e=i;
            for(int j=i;j<pre.length;j++){
                if(e>0)
                currSum=pre[j]-pre[e-1];

                else {
                    currSum=pre[j];
                }
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
    public static void main(String []args)
    {
        int arr[]={1,-2,6,-1,3};
        System.out.println("the maximum subarray sum is: "+sum(arr));
    }
    
}
