import java.util.*;
public class shortestPath {
    public static double path(String str){
        double ans=0;
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W' || str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='E' || str.charAt(i)=='e'){
                x++;
            }
            else if(str.charAt(i)=='N' || str.charAt(i)=='n'){
                y++;
            }
            else if(str.charAt(i)=='S' || str.charAt(i)=='s'){
                y--;
            }
            else {
                continue;
            }
        }
        ans=Math.sqrt(x*x + y*y);
        return ans;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // String str="WNEENESENNN";
        System.out.println("enter the string ");
        String str= sc.nextLine();

        System.out.println("the shortest path for given string "+str +" : "+path(str));
    }
}
