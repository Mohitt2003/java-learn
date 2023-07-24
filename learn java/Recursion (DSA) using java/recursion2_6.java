public class recursion2_6 {
    public static boolean[] map=new boolean[26];
    public static void removeduplicates(String str, int idx, String newsString) {
        if(idx==str.length()){
            System.out.println(newsString);
            return;    
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']){
            removeduplicates(str, idx+1, newsString);
        }
        else{
         newsString+=currchar;
         map[currchar-'a']=true;   
         removeduplicates(str, idx+1, newsString);
        }
    }
    public static void main(String args[]) {
        String str="abbccda";
        removeduplicates(str, 0, "");
    }
    }

