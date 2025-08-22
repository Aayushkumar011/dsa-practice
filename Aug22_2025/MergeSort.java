package Aug22_2025;

public class MergeSort {
    public static void merge(int[] arr,int s,int m,int e){
        int start = s;
        int mid1 = m;
        int mid2 = m+1;
        int end = e;
        int[] a = new int[e-s+1];
        int i=0;
        while(start<=mid1 && mid2<=end){
            if(arr[start]<=arr[mid2]){
                a[i] = arr[start];
                start++;
            }
            else{
                a[i] = arr[mid2];
                mid2++;
            }
            i++;  
        }
        while(start<=mid1){
            a[i] = arr[start];
                start++;
                i++;
        }
       while(mid2<=end){
            a[i] = arr[mid2];
                mid2++;
                i++;
        }

        for(int j=0;j<a.length;j++){
            arr[s+j]=a[j];
        }
    }
    public static void mergeSort(int[] arr,int s,int e){
        if(s>=e)return;
        // find mid
        int mid = s+(e-s)/2;

        //sort left
        mergeSort(arr,s,mid);

        //sort right
        mergeSort(arr,mid+1,e);

        // merge all arr while backtracking
        merge(arr,s,mid,e);
    }
    public static void main(String[] args){
        int[] arr = {15,6,45,3,16,43,343,5,54,5,45,4,54,5,5,43,54,56,5,7,5,5,35,547,9};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
