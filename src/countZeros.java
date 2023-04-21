public class countZeros{
    public static void main(String args[]) {
        System.out.println(helper(8090943,0));        
    }

    static int helper(int n,int count){
        
        if(n==0)   return count;
        
        int remainder = n%10;
        if(remainder==0){
            count++;
        }
        return helper(n/10,count);
    }
}