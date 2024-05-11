import java.util.*;

// given a string with equal number of L and R's and now we need to find a number x which is the maximum number 
// the string can be partitioned to balanced substring (substring with equal number of L's and R's)
public class Greedy6 {

    public static int findBalSubstring(String str) {
        int n = str.length();
        int l = 0;
        int r = 0;
        int ans = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }
            if (r == l) {
                ans++;
            }

        }
        return ans;
    }

    public static void main(String args[]) {

        String str = "LRRRRLLRLLRL";
        int ans = findBalSubstring(str);
        System.out.println(ans);
    }
}
