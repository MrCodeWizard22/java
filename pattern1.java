// square pattern 
import java.util.*;
public class pattern1 {
    public static void main(String []args){
        int n=4;
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<n;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        int i=0;
        
        while(i<n){
            int j=0;
            while(j<n){
                System.out.print(" * ");
                j++;
            }
            i++;
            System.out.println();
            
        }
    }
}
