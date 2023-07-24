//  place tiles of size 1xm in a floor of size n x m
public class recursion3_3 {
    public static int placeTiles(int n, int m) {
        if(n == m){
        return 2;
    }
    if( n < m){
        return 1;
    }
        // vertically
        int vartplacements = placeTiles(n-m, m);

        // horizontally
        int horplacemnts = placeTiles(n-1, m);
        return vartplacements+horplacemnts;
    }
    public static void main(String args[]) {
        int n=3 , m=5;
        System.out.println(placeTiles(n, m));
        
    }
}
