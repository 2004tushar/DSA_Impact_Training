package Day_4_DSA_Impact.Array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50}; // 1D Array

        int[][] b={
                {1,2},
                {3,4},
        };// 2D Array

        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");// printing 1D - Array

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] +" ");
            }
            System.out.println();
        }// 2D - Array Printing
    }
}