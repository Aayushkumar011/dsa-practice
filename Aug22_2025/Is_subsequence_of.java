package Aug22_2025;
public class Is_subsequence_of {
    public static void main(String[] args){
        String s = "ush";
        String t = "aayush_kumar";
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println((i==s.length()));
    }
}
