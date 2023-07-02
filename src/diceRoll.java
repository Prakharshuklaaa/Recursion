import java.util.ArrayList;

public class diceRoll {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int target = 4;
        ArrayList<Integer> lst = new ArrayList<>();
        helper(arr,target,lst);
        // System.out.println(lst);
    }

    public static void helper(int arr[],int target,ArrayList<Integer> lst){
        if(target==0){
            System.out.println(lst);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                lst.add(arr[i]);
                helper(arr, target-arr[i], lst);
                lst.remove(lst.size()-1);
            }else{
                return;
            }
        }
    }
}
