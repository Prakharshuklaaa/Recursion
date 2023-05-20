public class rotated_BS{

    public static void main(String args[]){
        int arr[] = {5,6,7,8,9,1,2,3};

        System.out.println(search(arr,0,arr.length-1,4));
    }

    static boolean search(int arr[],int start,int end,int tar){
        if(start>end){
            return false;
        }
        int mid = start + (end-start)/2;
        if(tar == arr[mid]){
            return true;
        }

        if(arr[start]<=arr[mid]){
            if(tar>=arr[start]&&tar<=arr[mid]){
                return search(arr,start,mid-1,tar);
            }else{
                return search(arr,mid+1,end,tar);
            }
        }else{
            if(tar>=arr[mid]&&tar<=arr[end]){
                return search(arr,mid+1,end,tar);
            }else{
                return search(arr,start,mid-1,tar);
            }
        }
    }

}