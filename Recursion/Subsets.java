import java.util.*;
public class Subsets {
    public static void subsets(int[] arr,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> l,int index){
        if(index>=arr.length){
            list.add(new ArrayList<>(l));
            return;
        }
        subsets(arr,list,l,index+1);
        l.add(arr[index]);
        subsets(arr,list,l,index+1);
        l.remove(l.size()-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        int index = 0;
        subsets(arr,list,l,index);
        System.out.println(list);
    }
}
