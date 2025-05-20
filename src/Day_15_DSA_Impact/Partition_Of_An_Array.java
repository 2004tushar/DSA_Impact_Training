package Day_15_DSA_Impact;

public class Partition_Of_An_Array {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 5, 2, 3, 4, 1};
        int ans = partition(arr, 0, arr.length - 1);
        System.out.println(ans);
    }
    public static int partition(int[] arr, int si, int ei){
        int idx = 0;
        int pivot = arr[ei];
        for (int i = 0; i < ei; i++) {
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }

}
