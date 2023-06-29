import java.math.BigInteger;
import java.util.Scanner;

public class removeA {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the large integer: ");
        String input = scanner.nextLine();

        BigInteger largeInt = new BigInteger(input);

        // Now you can perform operations on 'largeInt'
        System.out.println("You entered: " + largeInt/2);
    }

    public static String helper(String str,int idx){
        if(idx>=str.length()){
            return "";
        }
        if(str.charAt(idx)!='a'){
            String ans = str.charAt(idx) + helper(str, idx+1); 
            return ans;
        }
        return helper(str, idx+1);              
        
    }
    
}
