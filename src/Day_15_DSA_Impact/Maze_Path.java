package Day_15_DSA_Impact;

public class Maze_Path {;
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int ans = Maze(0, 0, m - 1, n - 1, "");
        System.out.println(ans);
    }
    public static int Maze(int cur_col, int cur_row, int end_col, int end_row, String ans){

        if (cur_row > end_row || cur_col > end_col) {
            return 0;

        }

        if (cur_row == end_row && cur_col == end_col) {
            System.out.println(ans);
            return 1;
        }

        int Horizontal =  Maze(cur_row, cur_col + 1, end_col, end_row, ans + "H");
        int Vertical = Maze(cur_row + 1, cur_col, end_col, end_row, ans + "V");
//        Maze(cur_row + 1, cur_col + 1, end_col, end_row, ans + "D");
        return Horizontal + Vertical;
    }

}
