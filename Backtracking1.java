// we have an array of size 5 now we have to assign the value 1 to 5 for all indeces 
public class Backtracking1 {

    public static void assign(int arr[] , int i){

        if (i == arr.length ){
            return ;
        }
        arr[i] = i+1;
        assign(arr, i+1);
        arr[i] = arr[i]-2;
    }

    public static void main(String args[]){
        int arr[] = new int [5];
        assign(arr , 0);

        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
