import java.util.*;
public class Stack2 {
    public static void bottompush(int val , Stack<Integer> st){
        if (st.isEmpty()){
            st.push(val);
            return ;
        }
        int num = st.pop();
        bottompush(val, st);
        st.push(num);

    }
    public static void main(String []args){
        Stack <Integer> st = new Stack<>();
        st.push (10);
        st.push(45);
        st.push(18);
        st.push(17);
        st.push(49);

        
        bottompush(33, st);
        // System.out.println(st.peek());
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
