// we've two integers n and k. now we need to find lexicographically smallest string of length n with sum of 
// characters equal to k , 'a' = 1 , 'b' = 2 ... 
public class Greedy8 {
    public static String findString(int n, int k) {
        StringBuilder ans = new StringBuilder();
        int temp = k;
        int l = n;
        int i = 26;
        char ref[] = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        while (temp != 0 && l > 0 && i > 0) {
            int t = l - 1;
            if ((temp - i) < t) {
                i--;
            } else {
                ans.append(ref[i]);
                temp = temp - i;
                l--;
            }
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 42;
        String ans = findString(n, k);
        System.out.println(ans);
    }
}
