public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {5,32,64};

        System.out.println(search(arr,32,0,arr.length-1));

    }
    static int search(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(target==arr[mid]){
            return mid;
        }

        if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }
        return search(arr ,target,mid+1,end);
    }
}
