// finding all the permutation of a string 
public class Backtracking3 {

    public static void printPermutations(String str , String ans){

        if (str.length() == 0){
            System.out.println(ans);
            return ;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String str2 = str.substring(0, i) + str.substring(i+1, str.length());
            printPermutations(str2, ans + ch);
        }
    }

    public static void main(String []args){
        String str = "abc";
        String ans = "";

        printPermutations(str,ans);
    }
    
}
