import java.util.*;
public class Greedy1 {

    public static void main(String[] args) {
        int s[] = {10, 12, 20};
        int e[] = {20, 25, 30};

        ArrayList<Integer> arr= new ArrayList<>();
        int last = e[0];
        arr.add(e[0]);
        int count = 1;
        for(int i = 1; i < s.length; i++){
            if(s[i] >= last){
                count ++;
                arr.add(e[i]);
                last = e[i];
            }
        }
        System.out.println(count );
        
    }
}
