import java.util.*;
// printing the star pattern pyramid left shifted 
public class pattern2 {
    public static void main(String []args){
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
