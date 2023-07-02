import java.util.*;
public class subsetAvoidDuplicate {
    public static void main(String args[]){
        int arr[] = {1,2,2,3};

        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int pSize = 0;
        for(int i=0;i<arr.length;i++){
            int n = outer.size();
            int temp = outer.size()-pSize;
            pSize = 0;
            if(i!=0&&arr[i]==arr[i-1]){
                for(int j=temp;j<n;j++){
                    ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                    pSize++;
                }
            }else{
                for(int j=0;j<n;j++){
                    ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
                    pSize++;
                }
            }
        }
        System.out.println(outer);
    }
}
