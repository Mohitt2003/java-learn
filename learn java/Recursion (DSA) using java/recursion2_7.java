public class recursion2_7 {
    public static void subsequences(String str, int idx, String newsString) {
        if(idx==str.length()){
            System.out.println(newsString);
            return;
        }
        char currChar= str.charAt(idx);
        //to be
        subsequences(str, idx+1, newsString+currChar);
        //not to be
        subsequences(str, idx+1, newsString);
    }
    public static void main(String args[]) {
        String str="abc";
        subsequences(str, 0, "");
    }
}
