public class merge_sort{
    public static void main(String args[]){
        int arr[] = {9,3,2,5,1,6};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[],int start,int end){
        int mid = start + (end-start)/2;
        int l1 = mid-start+1;
        int l2 = end - mid;

        int arr1[] = new int[l1];
        int arr2[] = new int[l2];

        int idx = start;

        for(int i=0;i<l1;i++){
            arr1[i] = arr[idx++];
            
        }
        
        for(int i=0;i<l2;i++){
            arr2[i] = arr[idx++];
        }

        int i = 0;
        int j = 0;

        idx = start;

        while(i<l1&&j<l2){
            if(arr1[i]<arr2[j]){
                arr[idx++] = arr1[i++];
            }else{
                arr[idx++] = arr2[j++];
            }
        }

        while(i<l1){
            arr[idx++] = arr1[i++];
        }

        while(j<l2){
            arr[idx++] = arr2[j++];
        }

    }

    public static void divide(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;

        divide(arr,start,mid);
        divide(arr,mid+1,end);

        sort(arr,start,end);
    }
}