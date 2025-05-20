package Day_8_DSA_Impact;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {65,38,89, 56};
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
