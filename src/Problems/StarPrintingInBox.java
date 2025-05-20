package Problems;

import java.util.Scanner;

public class StarPrintingInBox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number of Rows & colunm: ");
        int NumOfStar = in.nextInt();

        for (int row = 1 ; row <= NumOfStar; row++) {
            for (int col = 1; col <= NumOfStar; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
