public class Nto1{
    public static void main(String args[]) {
        int n = 5;
        helper(n);        
    }

    static void helper(int n){
        if(n==0){
            return;
        }
        helper(n-1);
        System.out.println(n);
    }

}