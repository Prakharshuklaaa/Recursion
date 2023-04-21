public class isSorted{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,9,8};
        System.out.println(helper(arr,0));
    }
    static boolean helper(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[1+idx]) return false;
        return helper(arr, idx+1);
    }
}