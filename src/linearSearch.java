public class linearSearch {
    public static void main(String args[]){
        int arr[] = {3,4,22,34,43,32,90,30};
        System.out.println(helper(arr,0,39));
    }
    static boolean helper(int arr[],int idx,int target){
        if(idx>arr.length-1){
            return false;
        }
        if(arr[idx]==target) return true;
         return helper(arr,idx+1,target);
    }
}
