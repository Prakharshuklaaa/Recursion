import java.lang.reflect.Array;
import java.util.*;

public class subsetForLoop {

    public static void main(String args[]){
        int arr[] = {1,2,3};

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int i=0;i<arr.length;i++){
            int n = outer.size();
            for(int j=0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        System.out.println(outer);        
    }
    
}
