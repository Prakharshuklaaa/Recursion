public class factorial {
    public static void main(String[] args) {
        System.out.println(helper(0));
    }
    static int helper(int n){
        if(n==0){
            return 1;
        }
        int factorial = n*helper(n-1);
        return factorial;
    }
}
