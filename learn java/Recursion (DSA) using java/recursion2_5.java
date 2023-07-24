import java.security.PublicKey;

public class recursion2_5 {
    public static void moveAllX(String str , int idx, int count, String newString) {
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }else{
            newString+= currchar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String args[]) {
        String str="axbcxxd";
        moveAllX(str, 0, 0, "");
    }
    
}