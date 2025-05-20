package Problems;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();

        //left Pattern
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - 1; j++) {
                System.out.print("");
            }
            for (int j = 1;j <= (size + 1) - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
