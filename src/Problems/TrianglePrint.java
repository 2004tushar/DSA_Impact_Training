package Problems;

import java.util.Scanner;

public class TrianglePrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of pattren: ");
        int size = in.nextInt();

        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size - i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
