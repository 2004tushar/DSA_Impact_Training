package Day_6_DSA_Impact;

public class Swaping {
    public static void main(String[] args) {
        int [] arr = {10,20,4,50,5};
//        int a = arr[0];
//        int b = arr[arr.length -1];
//        int temp = a;
//        a = b;
//        b = temp;
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
