public class Pratisce {
    public static void main(String args[]){
        int arr[] = { 4,3,8,1};
        helper(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }

    public static void helper(int arr[],int start,int end){

        if(start>=end){
            return;
        }

        int mid = start + (end-start)/2;

        helper(arr,start,mid);
        helper(arr,mid+1,end);

        sort(arr,start,end);
    }

    public static void sort(int arr[],int start,int end){

        int mid = start + (end-start)/2;

        int l1 = mid-start+1;
        int l2 = end - mid;

        int arr1[] = new int[l1];
        int arr2[] = new int[l2];

        int idx1 = 0;
        int idx2 = 0;
        int k = start;

        while(idx1<l1){
            arr1[idx1++] = arr[k++];
        }

        while(idx2<l2){
            arr2[idx2++] = arr[k++];
        }

        k = start;
        idx1 = 0;
        idx2 = 0;

        while(idx1<l1&&idx2<l2){
            if(arr1[idx1]<arr2[idx2]){
                arr[k++] = arr1[idx1++];
            }else{
                arr[k++] = arr2[idx2++];
            }
        }

        while(idx1<l1){
            arr[k++] = arr1[idx1++];
        }

        while(idx2<l2){
            arr[k++] = arr2[idx2++];
        }
    }
}
