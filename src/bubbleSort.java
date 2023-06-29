public class bubbleSort {

    public static void main(String args[]){
        
        int arr[] = {12,5,11,10,1};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[],int count,int range){
        if(range == 0){
            return;
        }

        if(count<range){
            if(arr[count]>arr[count+1]){
                int temp = arr[count+1];
                arr[count+1] =  arr[count];
                arr[count] = temp;
                sort(arr,count+1,range);
            }else{
                sort(arr,count+1,range);
            }
        }else{
            sort(arr,0,range-1);
        }
    }
    
}
