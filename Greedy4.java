import java.util.*;
// the program is "Indian coins " where we're given a value we need to convert it to indian change using the notes value
public class Greedy4 {
    public static void main(String []args){
        int notes[] = {2000, 500, 200, 100, 50 , 20, 10 ,5, 2, 1};
        int val = 121;
        int temp = val;
        int i = 0;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(temp != 0){
            if(temp < notes[i]){
                i++;
            }
            else{

                temp -= notes[i];
                ans.add(notes[i]);
                count++;
            }
        }
        System.out.println(count + "  " + ans);
    }
}
