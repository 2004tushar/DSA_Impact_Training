package Problems;

import java.util.Scanner;

public class RHSTriangle {
    public static void main(String[] args) {
        int row = 1, col =1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Num of Rows: ");
        int RHT = in.nextInt();

        for (row = 1; row <= RHT; row++){
            for (col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
