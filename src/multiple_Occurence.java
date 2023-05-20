import java.lang.reflect.Array;
import java.util.ArrayList;

public class multiple_Occurence {

    
    public static void main(String args[]){
        int arr[] = {4,3,5,5,1};
        int target = 5;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans = multipleOccurence(arr,0,target);
        System.out.println(ans);
    }

    static ArrayList<Integer> multipleOccurence(int arr[],int idx,int target){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx>=arr.length){
            return ans;
        }

        if(arr[idx]==target){
            ans.add(idx);
        }
        
        ArrayList<Integer> temp = multipleOccurence(arr, idx+1, target);

        ans.addAll(temp);
        return ans;
    }
}
