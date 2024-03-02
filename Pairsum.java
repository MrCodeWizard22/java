import java.util.ArrayList;

public class Pairsum {
    public static ArrayList<Integer> solve(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int br = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                br = i;
                break;
            }
        }
        int s = br + 1;
        int e = br;
        while (s != e) { 
            int sum = arr[s] + arr[e];
            if (sum == target) {
                ans.add(s);
                ans.add(e);
                break;
            } else if (sum < target) {
                s = (s + 1) % n;
            } else {
                e = (e - 1 + n) % n;
            }
        }
        return ans; 
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        ArrayList<Integer> list = solve(arr, target);
        
        if (list.isEmpty()) {
            System.out.println("No pairs found that sum up to the target.");
        } else {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
        }
    }
}
