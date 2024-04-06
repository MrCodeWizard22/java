import java.util.*;

public class Stack4 {
    public static int generater(Character ch ){
        char arr [] = {'0' , '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(int i = 0 ; i < arr.length; i++){
            if (ch == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static String findMessage(String code ){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < code.length(); i++){
            char ch = code.charAt(i);
            int n = generater(ch);
            StringBuilder temp = new StringBuilder();
            if (n == -1){
                if (ch == '['){
                    while(!st.isEmpty() && st.peek() != '['){
                        temp.append(st.pop());
                    }
                    // Pop '['
                    if (!st.isEmpty())
                        st.pop();
                }
                else {
                    st.push(ch);
                }
            }
            else {
                if (!st.isEmpty() && st.peek() == '['){
                    while(n > 0){
                        temp.append(st.pop());
                        n--;
                    }
                }
            }

            sb.append(temp.reverse());
        }
        return sb.toString();
    }

    public static void main(String []args){
        String message = findMessage("3[b2[v]]");
        System.out.println("the message is " + message);
    }
}
