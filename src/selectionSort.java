public class selectionSort {
    public static void main(String args[]){
        int arr[] = {3,2,4,1,6};
        
        sort(arr,0,arr.length-1,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }

    static void sort(int arr[],int count,int range,int max){
        if(range==0){
            return;
        }
        if(count<=range){
            if(arr[count]>arr[max]){
                max = count;
            }
            sort(arr,count+1, range, max);
        }else{
            int temp = arr[max];
            arr[max] = arr[count-1];
            arr[count-1] = temp;
            sort(arr,0, range-1, 0);
        }
    }
}
