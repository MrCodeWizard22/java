// finding the next greater element in an array using stack
import java.util.*;
public class Stack3 {
    public static void nextgreater(int arr []){
        int ans [] = new int[arr.length];
        Stack < Integer > st = new Stack<>();
        for(int i = arr.length-1; i >= 0; i-- ){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i]);
                ans[i] = -1;
            }
            else{

                ans[i] = st.peek();
                st.push(arr[i]);
                
            }
        }
        for(int i = 0; i< ans.length; i++){
            System.out.println(ans[i]);
        }
    }
    public static void main(String [] args){
        int arr[] = {6, 8, 0, 1, 3};
        nextgreater(arr); 
    }
    
}
