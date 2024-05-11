// we need to find the kth largest odd number in the given range if k > numbers in range return 0
public class Greedy7 {

    public static int findOdd(int s, int e, int k) {
        int total = e - s + 1;
        int ans = e;
        if (total < k) {
            return 0;
        }
        if (e % 2 == 0) {
            ans = e - 1;
            e--;
        }
        for (int i = e; i >= s; i--) {
            if (ans > s && k > 1) {
                ans -= 2;
                k--;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int s = -3;
        int e = 2;
        int k = 2;

        int ans = findOdd(s, e, k);
        System.out.println(ans);

    }
}
