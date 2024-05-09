import java.util.*;
// so here we're finding the min. absolute difference 
public class Greedy3 {
    public static void main(String []args){
        int a [] = {2,2,3};
        int b [] = {2,1,3};

        int ans = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++){
            ans += (a[i] - b[i]) > 0? a[i]-b[i]:b[i]-a[i];
        }
        System.out.println(ans);
    }
}
