// there is assignment number 1 in which we have given a number we need to find the binary code of all the decimal values till n 
import java.util.*;
public class QueueAssign {
    public static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        
        if (num == 0) {
            return "0"; 
        }
        
        while (num > 0) {
            int rem = num % 2;
            binary.insert(0, rem); 
            num = num / 2;
        }
        
        return binary.toString();
    }
    

    public static List<String> find(int n) {
        List<String> binaryList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            String binary = decimalToBinary(i);
            binaryList.add(binary);
            System.out.println("The binary of " + i + " is " + binary);
        }
        
        return binaryList;
    }
    
    public static void main(String []args){
        List<String> binaryNumbers = find(5);
    
    
        for (int i = 0; i < binaryNumbers.size(); i++) {
            System.out.println("Binary of " + (i + 1) + ": " + binaryNumbers.get(i));

        }
    }
}
