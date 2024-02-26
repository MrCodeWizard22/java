// finding the number of InversionPair in an array to get it sorted 
public class InversionPair {

    public static int merge(int arr[], int s, int e, int mid) {
        int temp[] = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        int ans = 0;
    
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                ans += (mid - i + 1); 
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }
    
        for (int l = 0; l < temp.length; l++) {
            arr[s + l] = temp[l];
        }
        return ans;
    }
    
    
    public static int merge_sort(int arr[], int s, int e){
        int ans = 0;
        if(s < e){
            int mid = s + (e - s) / 2;

            ans = merge_sort(arr, s, mid);
            ans = ans + merge_sort(arr, mid+1, e);

            ans = ans + merge(arr, s, e, mid);

        }
        return ans;
    }

    public static void main(String args[]){

        int  arr[] = {2, 4, 1, 3, 5};
        int e = arr.length-1;
        int s = 0;

        System.out.println("Number of inversion pairs are "+merge_sort(arr,s,e));
    }
}
