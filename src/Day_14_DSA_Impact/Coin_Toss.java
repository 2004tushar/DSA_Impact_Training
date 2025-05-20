package Day_14_DSA_Impact;

public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        int ans = coinToss(n, " ");
        System.out.println(ans);
    }
    public static int coinToss(int n, String ans){
        if (n == 0) {
            System.out.println(ans);
            return 1;

        }
        int H = coinToss(n - 1, ans + "H");
        int T = coinToss(n - 1, ans + "T");
        return H + T;
    }
}
