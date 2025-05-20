package Day_6_DSA_Impact;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
