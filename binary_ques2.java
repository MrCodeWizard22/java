// finding the peak index in a mountain array 
public class binary_ques2 {
    public static int find(int arr[]){
        int s=0;
        int e=arr.length-1;
        int mid=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return mid;
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,3,2,1};

        System.out.println("the peak index in mountain array is "+find(arr));
    }
}
