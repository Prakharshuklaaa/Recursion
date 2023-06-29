public class quick_Sort {
    public static void main(String[] args) {

        int arr[] = {10,80,30,90,40,9};

        sort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
        
    }

    public static void sort(int arr[],int low,int high){
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }

            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        sort(arr, low, end);
        sort(arr,start,high);
    }
}
