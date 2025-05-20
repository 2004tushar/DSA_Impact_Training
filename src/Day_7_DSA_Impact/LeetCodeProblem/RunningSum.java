package Day_7_DSA_Impact.LeetCodeProblem;

public class RunningSum {
    public static void main(String[] args) {
        int [] num = {1,2,3,4};
        int[] sum = new int[num.length];
        sum[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            sum[i] = num[i] + sum[i-1];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}
