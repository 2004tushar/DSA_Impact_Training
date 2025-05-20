package Day_14_DSA_Impact;

public class Dies_Roll {
    public static void main(String[] args) {
        int n = 4;
        int ans = Sum_Of_Dies(n, 0, "");
        System.out.println(ans);
    }

    public static int Sum_Of_Dies(int Max_Roll_Of_Dies, int Current_Sum, String ans) {
        if (Current_Sum > Max_Roll_Of_Dies) {
            return 0;
        }
        if (Max_Roll_Of_Dies == Current_Sum) {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= Max_Roll_Of_Dies; i++) { // Changed to 6 since a die has 6 faces
            count += Sum_Of_Dies(Max_Roll_Of_Dies, Current_Sum + i, ans + i);
        }
        return count;
    }
}