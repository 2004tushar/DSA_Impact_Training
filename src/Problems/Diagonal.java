package Problems;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int Size = in.nextInt();

        for(int row = 1;row <= Size;row++){
            for(int col = 1;col <= Size;col++){
                if (row == col){
                    System.out.print("*");
                }else {
                    System.out.print("");
                }
            }
        }
    }
}
