package Day_5_DSA_Impact.Array;

public class ArrayDemo {
    public static void main(String[] args) {
        // Array Syntax
        //datatype[] var_name = new datatype[size];

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
