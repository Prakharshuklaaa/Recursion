// Original Error is not modified

import java.util.Arrays;

public class merge_sortKK {
    public static void main(String args[]){
        int arr[] = {9,3,2,5,1,6};
        int ans[] = divide(arr);

        for(int i= 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }


    public static int[] divide(int[] arr){

        if(arr.length==1) return arr;
        

        int mid = arr.length/2;
        int left[] = divide(Arrays.copyOfRange(arr, 0, mid));
        int right[] = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);

    }

    static int[] merge(int[] left,int[] right){

        int arr[] = new int[left.length+right.length];

        int i = 0;
        int j = 0;
        int idx = 0;

        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                arr[idx++] = left[i++];
            }else{
                arr[idx++] = right[j++];
            }
        }

        while(i<left.length){
            arr[idx++] = left[i++];
        }

        while(j<right.length){
            arr[idx++] = right[j++];
        }

        return arr;
    }
}
