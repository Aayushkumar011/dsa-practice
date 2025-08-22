package Aug22_2025;

public class QuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int s,int e){
        int pivit = arr[s];
        int c = 0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivit){
                c++;
            }
        }
        int index=s+c;
        swap(arr,s,index);

        int i = s;
        int j = e;
        while(i<index && j>index){
            while(arr[i]<pivit){
                i++;
            }
            while(arr[j]>pivit){
                j--;
            }
            if (i < index && j > index) {
                swap(arr, i++, j--);
            }
        }
        return index;
    } 
    public static void quickSort(int[] arr,int s,int e){
        if(s>=e)return;
        int p = partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }
    public static void main(String[] args){
        int[] arr = {15,6,45,3,16,43,343,5,54,5,45,4,54,5,5,43,54,56,5,7,5,5,35,547,9};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
