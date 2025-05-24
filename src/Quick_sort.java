package Day_16_DSA_Impact;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 5, 6, 3, 4};
        sort(arr, 0, arr.length - 1);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    public static void sort(int[] arr, int si, int ei){
        if (si >= ei){
            return;
        }
        int pi = Partition(arr, si, ei);
        sort(arr, si, pi-1);
        sort(arr, pi+1, ei);
    }
    public static int Partition(int[] arr, int si, int ei){
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
