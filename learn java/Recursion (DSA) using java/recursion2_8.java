import java.util.HashSet;

public class recursion2_8 {
     public static void subsequences(String str, int idx, String newsString, HashSet<String>set) {
        if(idx==str.length()){
            if(set.contains(newsString)){
                return; 
            }else{
                System.out.println(newsString);
                set.add(newsString);
                return;
            }
        }
        char currChar= str.charAt(idx);
        //to be
        subsequences(str, idx+1, newsString+currChar,set);
        //not to be
        subsequences(str, idx+1, newsString, set);
    }
    public static void main(String args[]) {
        String str="aaa";
        HashSet<String>set = new HashSet<>();
        subsequences(str, 0, "",set); 
        
    }
}
