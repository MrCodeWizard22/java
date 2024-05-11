import java.util.*;

// chocola prolem we'are given a chocolate along with cuts and their costs(vertical and horizontal )and we need to cut them into individual squares 
// so that the costs will be minimum  
public class Greedy5 {

    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer costHor[] = { 2, 1, 3, 1, 4 };
        Integer costVer[] = { 4, 1, 2 };

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] <= costVer[v]) {
                cost += hp * costVer[v];
                v++;
                vp++;

            } else {
                cost += vp * costHor[h];
                h++;
                hp++;
            }

        }
        while (h < costHor.length) {
            cost += vp * costHor[h];
            h++;
            hp++;
        }
        while (v < costVer.length) {
            cost += hp * costVer[v];
            v++;
            vp++;
        }
        System.out.println(cost);
    }

}
