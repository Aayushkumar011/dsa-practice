public class Maximum_Element {
    public static void max(int[] arr,int n){
        int max = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int[] arr = {15,6,45,3,16,43,343,5,54,5,45,4,54,5,5,43,54,56,5,7,5,5,35,5247,9};
        int n = arr.length;
        max(arr,n);
    }
}
