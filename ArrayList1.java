// we'll have the basics of the array list here we'll see how we can define in . 
// we cannot store the premitive data types in an arraylist we'll here store the objects by some classes such that 
// Integer class , String class , Boolean class

import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {

    public static void main(String []args){
        
        ArrayList<Integer> list = new ArrayList<>();

        // some operations on arraylist are:-

        // 1. Add element using add() method with time complexity(tc) = o(1);
        list.add(7);
        list.add(49);
        list.add(18);
        list.add(45);

        // System.out.println(list);

        // 2. get element using get() method with tc= o(1);

        // int temp = list.get(0);
        // System.out.println(temp);

        // 3. delete an element using remove method with tc = o(n);

        // list.remove (2);
        // System.out.println(list);

        // 4.set element using set() method with tc o(n)

        // list.set(2,17);
        // System.out.println(list);

        // 4. contains element with tc o(n) 

        // System.out.println(list.contains(7));
        // System.out.println(list.contains(18));

        // 5.size() method  is similiar to cpp vectors
        // System.out.println(list.size());

        list.add(58);
        list.add(60);
        list.add(20);

        // finding the maximum element in list 
        int max = Integer.MIN_VALUE;
        for(int i =0; i < list.size(); i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(list);
        System.out.println(max);

       Collections.sort(list);
       System.out.println(list);
    }
    
}
