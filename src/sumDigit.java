public class sumDigit {
    public static void main(String args[]) {

        int n = 69;
        System.out.println(helper(n));
        
    }
    static int helper(int n){
        if(n==0){
            return 0;
        }
        int digi = n%10;
        int sum = digi + helper(n/10);
        return sum;
    }
    
}
