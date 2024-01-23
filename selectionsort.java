public class selectionsort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            
            int pos=i;
            for(int j=i+1;j<n;j++){
                if(arr[pos]>arr[j]){
                    pos=j;
                }
            }
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int arr[]={4,3,5,1,2};
        selectionSort(arr);
        printarr(arr);
    }
}
