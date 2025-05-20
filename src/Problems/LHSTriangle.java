package Problems;

import java.util.Scanner;

public class LHSTriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int LHT = in.nextInt();

        for (int row = 1; row <= LHT; row++){
            for (int col = 1; col <= row; col++){
                for (int space= 1;space<=LHT-row;space++){
                    System.out.print(" ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
