public class InsertionSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {15,6,45,3,16,43,343,5,54,5,45,4,54,5,5,43,54,56,5,7,5,5,35,547,9};
        int n = arr.length;
        insertionSort(arr,n);
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
