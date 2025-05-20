package Day_9_DSA_Impact;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        sort(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            InsertEle(arr,i);
        }
    }
    public static void InsertEle(int[] arr, int i){
        int  j = i - 1;
        int item = arr[i];
        while (j >= 0 && arr[j] > item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
    }
}
