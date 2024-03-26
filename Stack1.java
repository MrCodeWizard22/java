import java.util.ArrayList;

public class Stack1 {

    // stack using array list 


    // public static class Stack{
    //     static ArrayList<Integer> list= new ArrayList<>();

    //     public static void push ( int data ){
    //         list.add(data);

    //     }
    //     public static int pop(){
    //         if (isempty()){
    //             return -1;
    //         }
    //         int num = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return num ;

    //     }
    //     public static boolean isempty(){
    //         return list.size() == 0;
    //     }
    //     public static void peak (){
    //         if(isempty()){
    //             System.out.println("stack is empty ");
    //             return ;
    //         }
    //         System.out.println( list.get(list.size()-1));
    //     }
    // }

    // using linked list 

    public static class Node {
        int data ;
        Node next;
        Node (int data ){
            this.data = data ;
            this.next = null;
        }
    }
    public static class Stack{
        public static Node head;

        public static boolean isempty(){
            return head == null;
        }
        public static void push(int data ){
            Node newnode = new Node (data);
            if (isempty()){
                head = newnode ;
                newnode .next = null;
                return ;
            }
            newnode.next = head;
            head = newnode;
        }
        public static int pop(){
            if (isempty()){
                return -1;
            }
            int num = head.data;
            head = head.next;
            return num;
        }
        public static int peak (){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String []args){
        Stack st = new Stack();
        st.push (1);
        st.push(18);
        st.push (17);
        st.push(49);
        System.out.println(st.peak());
        st.pop();
        System.out.println(st.peak());


    }
}
