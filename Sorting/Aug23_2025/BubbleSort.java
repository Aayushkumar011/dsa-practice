public class BubbleSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr,int n){
        for(int i=n-1;i>0;i--){
            int did_swap = 0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    did_swap = 1;
                }
            }
            if(did_swap == 0){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {15,6,45,3,16,43,343,5,54,5,45,4,54,5,5,43,54,56,5,7,5,5,35,547,9};
        int n = arr.length;
        bubbleSort(arr,n);
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
