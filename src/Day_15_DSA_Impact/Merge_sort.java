package Day_15_DSA_Impact;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 45, 7};
        int[] ans = Sort(arr, 0, arr.length - 1);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }

    public static int[] Sort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] ba = new int[1];
            ba[0] = arr[si];
            return ba;
        }
        int mid = (si + ei) / 2;
        int[] fa = Sort(arr, si, mid);
        int[] sa = Sort(arr, mid + 1, ei);
        return Merge(fa, sa);
    }

    public static int[] Merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int arr[] = new int[m + n];
        int p = 0;
        int q = 0;
        int k = 0;
        while (p < arr1.length && q < arr2.length) {
            if (arr1[p] > arr2[q]) {
                arr[k] = arr2[q];
                q++;
                k++;
            } else {
                arr[k] = arr1[p];
                p++;
                k++;
            }
        }
        while (p < arr1.length) {
            arr[k] = arr1[p];
            p++;
            k++;
        }
        while (q < arr2.length) {
            arr[k] = arr2[q];
            q++;
            k++;
        }
        return arr;
    }
}