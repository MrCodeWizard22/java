// mergesort for the array of strings

public class Mergesort2 {

    public static void merge(String arr[], int s, int e, int mid ){
        int n1 = mid - s + 1;
        int n2 = e - mid;

        String[] one = new String[n1];
        String[] two = new String[n2];

        
        for (int i = 0; i < n1; ++i) {
            one[i] = arr[s + i];
        }
        for (int j = 0; j < n2; ++j) {
            two[j] = arr[mid + 1 + j];
        }

        
        int i = 0, j = 0;
        int k = s;
        while (i < n1 && j < n2) {
            if (one[i].compareTo(two[j]) <= 0) {
                arr[k] = one[i];
                i++;
            } else {
                arr[k] = two[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            arr[k] = one[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = two[j];
            j++;
            k++;
        }
    }

    public static void merge_sort(String arr[], int s, int e){
        if(s >= e){
            return ;
        }
        int mid = s + (e - s) / 2;
        merge_sort(arr, s, mid);
        merge_sort(arr, mid+1, e);

        merge(arr, s, e, mid);
    }
    
    public static void main(String args[]){
        String arr[] =  { "sun", "earth", "mars", "mercury"};

        int s = 0;
        int e = arr.length -1;
        merge_sort(arr, s, e);

        for(String a : arr){
            System.out.print(a+" ");
        }
    }
}
