// there is a question of fractional knapsack in which we have two arrays 
// first for weight and other for equivalent value,  we have given capacity of weight for which we need our maximum value 
// so we need to do it

import java.util.*;

public class Greedy2 {

    public static double fracKnap(int weight[], int value[], int w) {

        int cap = w;
        double ans = 0;
        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = value.length - 1; i >= 0; i--) {

            int indx = (int) ratio[i][0];

            if (cap >= weight[indx]) {
                ans += value[indx];
                cap -= weight[indx];
            } else {
                ans += (ratio[i][1] * cap);
                cap = 0;
                break;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        System.out.println("The maximum value for the given capacity is : " + fracKnap(weight, value, w));
    }
}
