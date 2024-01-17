// finding the first and the last index of the key in array 
public class binarysearch_ques {
    public static int firstOccurance(int arr[], int key){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==key){
                ans=mid ;
                e=mid-1;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int arr[], int key){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==key){
                ans=mid ;
                s=mid+1;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String []args){
        int arr []={1,2,2,2,3,3,3,3,4,4,4,4,5,5,6,6};
        int key=3;

        System.out.println("the first occurance of the key is "+firstOccurance (arr,key));
        System.out.println("the last occurance of the key is "+lastOccurance (arr,key));
    }
    
}
