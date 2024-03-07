import java.util.LinkedList;
// in Collectionsframework there are inbuilt data structures just like in stl in c++ and wee can use them 
// 2. mergesort on linkedlist 
public class Collectionsframe{

    public static void main(String []args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(7);
        ll.addLast(18);
        ll.addFirst(49);
        ll.addLast(45);
        ll.addFirst(17);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        
    }

}