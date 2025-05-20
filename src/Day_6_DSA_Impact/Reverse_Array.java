package Day_6_DSA_Impact;

public class Reverse_Array {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int p = 0;
        int q=arr.length - 1;
        while(p<=q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}