package Day_12_DSA_Impact;

public class Fact {
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fn = fact(n - 1);
        return n * fn;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println(ans);
    }
}
